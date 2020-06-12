package javafxlearning;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Shaft
 */
public class JavaFXLearning extends Application {
    Button btn2;
    
    Stage window;
    Scene scene, scene2;
    
    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        
        //root
        btn2 = new Button("Button 2");
        btn2.setOnAction(e -> {
            System.out.println("wow");
            btn2.setText("changed");
            System.out.println("works");
        });
        Button goButton = new Button("Goto scene 2");
        goButton.setOnAction(e->{
            window.setScene(scene2);
        });
        
        StackPane root = new StackPane();        
        root.getChildren().add(goButton);
        root.getChildren().add(btn2);
        
        scene = new Scene(root, 300, 250);
        
        
        //Scene 2
        Label label2 = new Label("Scene 2");
        Button button2 = new Button("Goto back to root");
        button2.setOnAction(e->{
            window.setScene(scene);
        });
        VBox layout2 = new VBox(20);
        layout2.getChildren().addAll(label2, button2);
        scene2 = new Scene(layout2, 300, 300);
        
        window.setTitle("Hello World!");
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
