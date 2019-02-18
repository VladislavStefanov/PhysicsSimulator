package vladi.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;

import org.yaml.snakeyaml.Yaml;

import javafx.concurrent.WorkerStateEvent;
import javafx.event.EventHandler;
import javafx.scene.shape.Shape;
import lombok.Getter;
import lombok.Setter;
import vladi.model.Body;
import vladi.model.Model;
import vladi.model.Point;
import vladi.view.View;

public class Controller {
	@Getter@Setter
	private View view;
	@Getter@Setter
	private Model model;
	@Setter
	private Point p0;
	@Setter
	private Double scaleX;
	@Setter
	private Double scaleY;
	
	private void addBody(Body body)
	{
		this.model.addBody(body);
	}
	
	public void addBodiesByYaml(String yamlFileLoaction)
	{
		Yaml yaml = new Yaml();
		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream(yamlFileLoaction);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Oh no");
			e.printStackTrace();
		}
		ArrayList<Body> bodies = yaml.load(inputStream); // can't make it work
		for (Body body : bodies)
		{
			this.addBody(body);
		}
	}
	
	public void updateView(Body body) {
		MyScheduledService service = new MyScheduledService(body.getMovementLaw());
		Shape shape = ShapeFactory.generateShape(body.getShape());
		this.view.add(shape);
		service.setOnSucceeded(new EventHandler<WorkerStateEvent>() {
			
			@Override
			public void handle(WorkerStateEvent event) {
				Double currentX = scaleX * ((Point)event.getSource().getValue()).getX() + p0.getX();
				Double currentY = scaleY * ((Point)event.getSource().getValue()).getY() + p0.getY();
				
				view.update(body.getId(), currentX, currentY);
			}
		});
		service.start();
	}
}
