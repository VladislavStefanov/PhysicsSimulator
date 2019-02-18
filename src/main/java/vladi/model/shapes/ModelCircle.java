package vladi.model.shapes;

import lombok.Getter;

public class ModelCircle extends ModelShape {
	@Getter
	private final Double radius;
	public ModelCircle(Double radius)
	{
		super("circle");
		this.radius = radius;
	}
}
