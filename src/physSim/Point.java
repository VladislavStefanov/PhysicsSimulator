package physSim;

public class Point {
	private double x = 0;
	private double y = 0;
	
	public Point (double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	public Point ()
	{
		this.x = 0;
		this.y = 0;
	}
	
	public void translateX(double dx) {
		this.x = x + dx;
	}
	public void translateY(double dy) {
		this.x = x + dy;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
}
