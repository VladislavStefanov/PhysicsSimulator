package vladi.model.shapes;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
abstract public class ModelShape {
	@Getter
	private final String shapeType;
}
