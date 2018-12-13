package physSim;

import javafx.scene.shape.Shape;

public class Body {
	private Point position = null;
	private Double mass = 0.0;
	private Shape node = null; // TODO must be in view
	
	public Point getPosition() {
		return position;
	}
	public void setPosition(Point position) {
		this.position = position;
		if (this.node != null)
		{
			//System.out.println(position.getX());
			this.node.setLayoutX(this.position.getX());
			this.node.setLayoutY(this.position.getY());			
		}
	}
	public Double getMass() {
		return mass;
	}
	public void setMass(Double mass) {
		this.mass = mass;
	}
	public Shape getNode() {
		return node;
	}
	public void setNode(Shape node) {
		this.node = node;
		if (position == null)
		{
			position = new Point();
		}
		
		this.node.setLayoutX(this.position.getX());
		this.node.setLayoutY(this.position.getY());
		
	}
	
	
}
