package vladi.model;

import lombok.Setter;
import vladi.controller.Controller;
import vladi.model.shapes.ModelShape;

public class Model {
	@Setter
	private Controller controller;
	
	public void addBody(SpaceLaw movementLaw, Double mass, ModelShape modelShape)
	{
		Body body = new Body(0, mass, modelShape, movementLaw);
		controller.updateView(body);
	}
	public void addBody(Body body)
	{
		controller.updateView(body);
	}
}
