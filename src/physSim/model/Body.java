package physSim.model;

import lombok.Getter;
import lombok.Setter;
import physSim.Point;

public class Body{
	@Getter@Setter
	private Point position = null;
	@Getter@Setter
	private Double mass = 0.0;
	
	public Body(Point position) {
		this.position = position;
	}
	
	
}
