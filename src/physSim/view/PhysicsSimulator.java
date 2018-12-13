package physSim.view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import physSim.Body;
import physSim.Point;
import physSim.Movement;
import physSim.TreeFunction;



public class PhysicsSimulator extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane root = new Pane();
		
		Circle circle = new Circle(200, 200, 50);
		Body body = new Body();
		body.setNode(circle);
		
		root.getChildren().addAll(body.getNode());
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setMaximized(true);
		
//		Path circleMotion = new Path();
//		Point oldP = new Point(body1.getCenterX(), body1.getCenterY());
//		circleMotion.getElements().add(new MoveTo(oldP.getX(), oldP.getY()));
//		for (int i = 0; i < 1000; i++) {
//			Point newP = body1Law(oldP, 0.1);
//			circleMotion.getElements().add(new LineTo(newP.getX(), newP.getY()));
//			oldP = newP;
//		}
//		PathTransition circleTransition = new PathTransition();
//		circleTransition.setDuration(Duration.millis(10000));
//		circleTransition.setPath(circleMotion);
//		circleTransition.setNode(body1);
//		circleTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
//		circleTransition.setCycleCount(Timeline.INDEFINITE);
//		circleTransition.setAutoReverse(true);
//		circleTransition.play();
		
		TreeFunction movementLawX = new TreeFunction(new TreeFunction(null, null, "number", 100), new TreeFunction(null, null, "x", 0), "*", 0);
		TreeFunction movementLawY = new TreeFunction(new TreeFunction(null, null, "x", 0), null, "sin", 0);
		Movement runTest = new Movement(body, movementLawX, movementLawY);
		Thread threadTest = new Thread(runTest);
		threadTest.start();
	}

	Point body1Law(Point p, double dTime)
	{
		double x = p.getX() + 5*dTime;
		double y = 0.01 * (x-500) * (x-500);
		
		return new Point(x, y);
	}
	
	public static void main(String[] args) {
		launch(args);

	}

}
