package physSim.view;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Shape;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class View {
	@Getter
	final private Pane pane;
	
	public void add(Shape shape) {
		if (!pane.getChildren().contains(shape))
		{
			pane.getChildren().add(shape);
		}
	}
	
	public void update(Shape shape, double x, double y) {
		shape.relocate(x, y);
	}
}
