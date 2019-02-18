package vladi.model;

import lombok.Value;
import vladi.model.shapes.ModelShape;

@Value
public class Body{
	final private Integer id;
	final private Double mass;
	final private ModelShape shape;
	final private SpaceLaw movementLaw;
}
