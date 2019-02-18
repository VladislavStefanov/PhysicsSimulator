package vladi.controller;

import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;
import vladi.model.shapes.ModelCircle;
import vladi.model.shapes.ModelShape;

public class ShapeFactory { // maybe not needed
	public static Shape generateShape(ModelShape modelShape)
	{
		if(modelShape.getShapeType() == "circle")
		{
			ModelCircle modelCircle = (ModelCircle)modelShape;
			Circle circle = new Circle(modelCircle.getRadius());
			return circle;
		}
		return null;
	}
}