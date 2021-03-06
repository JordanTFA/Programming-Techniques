package bouncing_ball;

/* 
 * https://www.mkyong.com/javafx/javafx-animated-ball-example/
 */

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class BouncingBall extends Application{

	public static void main(String[] args) {
		
		launch();

	}

	@Override
	public void start(Stage stage) throws Exception {
		
		Pane canvas = new Pane();
		Scene scene = new Scene(canvas, 300, 300, Color.ALICEBLUE);
		Circle ball = new Circle(10, Color.CADETBLUE);
		ball.relocate(5, 5);
		
		canvas.getChildren().add(ball);
		
		stage.setTitle("Bouncing Ball");
		stage.setScene(scene);
		stage.show();
		
		Timeline timeline = new Timeline(new KeyFrame(Duration.millis(20),new EventHandler<ActionEvent>(){
			
			double dx = 10; // Step on x or velocity
			double dy = 3; // Step on y
			
			double sizeChange = 1;
			double maxSize = 30;
			double minSize = 10;
			
			@Override
			public void handle(ActionEvent t){
				
				// Move the ball
				ball.setLayoutX(ball.getLayoutX() + dx);
				ball.setLayoutY(ball.getLayoutY() + dy);
				
				ball.setRadius(ball.getRadius() + sizeChange);
				
				Bounds bounds = canvas.getBoundsInLocal();
				
				// If the ball reaches the left or right border, make the step negative
				if(ball.getLayoutX() <= (bounds.getMinX() + ball.getRadius()) ||
						ball.getLayoutX() >= (bounds.getMaxX() - ball.getRadius()) ){
							
					dx*= -1;
				}
			
				// If the ball reaches the top or bottom border, make the step negative
				if((ball.getLayoutY() >= (bounds.getMaxY() - ball.getRadius())) || 
                    (ball.getLayoutY() <= (bounds.getMinY() + ball.getRadius()))){
					
					dy*= -1;
				}
				
				if(ball.getRadius() >= maxSize || ball.getRadius() <= minSize){
					sizeChange*= -1;
				}
					
			}

		}));
		
		timeline.setCycleCount(Timeline.INDEFINITE);
		timeline.play();
	}

}
