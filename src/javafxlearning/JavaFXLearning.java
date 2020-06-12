package javafxlearning;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Shaft
 */
public class JavaFXLearning extends Application {
    Button btn = new Button();
    Button btn2 = new Button("abcd");
    
    @Override
    public void start(Stage primaryStage) {
        
        btn.setText("Say 'Hello World'");
        
        btn2.setOnAction(e -> {
            System.out.println("wow" + e.getTarget().toString());
            System.out.println("works");
        });
        btn.setOnAction(e -> {
            System.out.println("buttn 2");
            System.out.println("works button 2");
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        root.getChildren().add(btn2);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
