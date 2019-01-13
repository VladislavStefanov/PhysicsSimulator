package physSim;

import java.util.HashMap;
import java.util.Map;

import javafx.concurrent.WorkerStateEvent;
import javafx.event.EventHandler;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;
import lombok.Getter;
import lombok.Setter;
import physSim.interfaces.IExpression;
import physSim.model.Body;
import physSim.model.Model;
import physSim.view.View;

public class Controller {
	@Getter@Setter
	private View view;
	@Getter@Setter
	private Model model;
	private Map<Body, MyScheduledService> serviceByBody = new HashMap<>();
	private Map<Body, Shape> shapeByBody = new HashMap<>();
	@Setter
	private Point p0;
	@Setter
	private double scaleX;
	@Setter
	private double scaleY;

	
	public void addBody(IExpression movementLaw)
	{
		this.model.addBody(movementLaw);
	}
	
	public void updateView(Body body, IExpression movementLaw) {
		MyScheduledService service = new MyScheduledService(movementLaw);
		if (!this.shapeByBody.containsKey(body))
		{
			Shape shape = new Circle(0, 0, 10);
			this.shapeByBody.put(body, shape);			
		}
		
		Shape shape = this.shapeByBody.get(body);
		if (!this.serviceByBody.containsKey(body))
		{
			this.serviceByBody.put(body, service);
			this.view.add(shape);
			this.view.update(shape, this.p0.getX(), this.p0.getY());
		}
		if (this.serviceByBody.get(body).isRunning())
		{
			this.serviceByBody.get(body).cancel();
		}
		this.serviceByBody.put(body, service);
		service.setOnSucceeded(new EventHandler<WorkerStateEvent>() {
			
			@Override
			public void handle(WorkerStateEvent event) {
				double currentX = scaleX * ((Point)event.getSource().getValue()).getX() + p0.getX();
				double currentY = scaleY * ((Point)event.getSource().getValue()).getY() + p0.getY();
				
				view.update(shape ,currentX, currentY);
			}
		});
		service.start();
	}
}
