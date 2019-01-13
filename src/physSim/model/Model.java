package physSim.model;

import java.util.HashMap;
import java.util.Map;

import lombok.Setter;
import physSim.Controller;
import physSim.Point;
import physSim.interfaces.IExpression;

public class Model {
	private Map<Body, IExpression> lawByBody = new HashMap<>();
	@Setter
	private Controller controller;
	
	public void addBody(IExpression movementLaw)
	{
		Body body = new Body(new Point(0,0));
		this.lawByBody.put(body, movementLaw);
		
		controller.updateView(body, movementLaw);
	}
}
