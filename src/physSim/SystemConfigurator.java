package physSim;

import javafx.scene.layout.Pane;
import physSim.model.Model;
import physSim.view.View;

public class SystemConfigurator {
	public static Controller config(Pane root, Point p0, double scaleX, double scaleY)
	{
		View view = new View(root);
		Model model = new Model();
		Controller controller = new Controller();
		controller.setModel(model);
		model.setController(controller);
		controller.setView(view);
		controller.setP0(p0);
		controller.setScaleX(scaleX);
		controller.setScaleY(scaleY);
		return controller;
	}
}
