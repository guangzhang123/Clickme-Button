
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * Write a description of JavaFX class ClickMe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ClickMe extends Application
{
   @Override
   public void start(Stage primaryStage)
   {
       Button button = new Button("Click me!");
       button.setStyle("-fx-font-size: 18px; -fx-background-color: lightblue;");
       button.setOnAction(e ->
       {
           Timeline timeline = new Timeline( new KeyFrame(Duration.millis(0),    new KeyValue(button.translateXProperty(), 0, Interpolator.EASE_BOTH)),
                    new KeyFrame(Duration.millis(100),  new KeyValue(button.translateXProperty(), -10, Interpolator.EASE_BOTH)),
                    new KeyFrame(Duration.millis(200),  new KeyValue(button.translateXProperty(), 10, Interpolator.EASE_BOTH)),
                    new KeyFrame(Duration.millis(300),  new KeyValue(button.translateXProperty(), -10, Interpolator.EASE_BOTH)),
                    new KeyFrame(Duration.millis(400),  new KeyValue(button.translateXProperty(), 10, Interpolator.EASE_BOTH)),
                    new KeyFrame(Duration.millis(500),  new KeyValue(button.translateXProperty(), 0, Interpolator.EASE_BOTH))
                    );
                    
                    timeline.play();
       });
       
        StackPane root = new StackPane(button);
        Scene scene = new Scene(root, 300, 200);

        primaryStage.setTitle("Smooth Shake Button");
        primaryStage.setScene(scene);
        primaryStage.show();
      
   }
     public static void main(String[] args) {
        launch(args);
    }
}
