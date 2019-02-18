package vladi.view;

import java.util.HashMap;
import java.util.Map;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Shape;
import lombok.Getter;

public class View {
	@Getter
	final private Pane pane;
	private Map<Integer, Shape> shapeById = new HashMap<>();
	
	public View (Pane pane)
	{
		this.pane = pane;
	}
	
	public void add(Shape shape) {
		if (!pane.getChildren().contains(shape))
		{
			pane.getChildren().add(shape);
		}
	}
	
	public void update(Integer shapeId, Double x, Double y) {
		this.shapeById.get(shapeId).relocate(x, y);
	}
}
