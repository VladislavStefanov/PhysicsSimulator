package vladi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import vladi.controller.Controller;
import vladi.model.Point;



public class PhysicsSimulator extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane root = new Pane();
		
		Controller controller = SystemConfigurator.config(root, new Point(500.0, 500.0), 20, 20);
		
		root.getChildren().add(new Line(550, 0, 550, 700));
		root.getChildren().add(new Line(0, 600, 1000, 600));
		
		
//		MovementLaw expression1 = new MovementLaw("x+2", "10 * sin(x)");
//		MovementLaw expression2 = new MovementLaw("5*x", "-2*x");
		
//		controller.addBody(expression1);
//		controller.addBody(expression2);
		
		controller.addBodiesByYaml("src/test/java/vladi/yaml/bodies.yml");
		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setMaximized(true);

	}
	
	public static void main(String[] args) {
		launch(args);

	}

}
