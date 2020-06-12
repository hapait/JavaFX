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
public class JavaFXLearning extends Application implements EventHandler<ActionEvent>{
    Button btn = new Button();
    Button btn2 = new Button("abcd");
    
    @Override
    public void start(Stage primaryStage) {
        
        btn.setText("Say 'Hello World'");
        
        btn2.setOnAction(this);
        btn.setOnAction(this);
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        root.getChildren().add(btn2);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(ActionEvent event) {
        if(event.getSource() == btn){
            System.out.println("btn is pressed");
        }else if(event.getSource() == btn2){
            System.out.println("btn2 is pressed");
        }
    }
    
}
