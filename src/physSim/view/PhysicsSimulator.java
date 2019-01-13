package physSim.view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import physSim.Controller;
import physSim.Point;
import physSim.SystemConfigurator;
import physSim.model.Expression;



public class PhysicsSimulator extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane root = new Pane();
		
		Controller controller = SystemConfigurator.config(root, new Point(500, 500), 20, 20);
		
		root.getChildren().add(new Line(550, 0, 550, 700));
		root.getChildren().add(new Line(0, 600, 1000, 600));
		
		Expression expression = new Expression("x+2", "10 * sin(x)");
		
		controller.addBody(expression);
		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setMaximized(true);

	}
	
	public static void main(String[] args) {
		launch(args);

	}

}
