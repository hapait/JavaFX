package javafxlearning;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MultiLayoutWindow {
    
    public static void display(String title, String message) {
        Stage window = new Stage();
        window.setTitle(title);
        window.setMinWidth(250);

        HBox topMenu = new HBox();
        Button file = new Button("File");
        Button edit = new Button("Edit");
        Button view = new Button("View");
        topMenu.getChildren().addAll(file, edit, view);
        
        VBox leftMenu = new VBox();
        Button project = new Button("Project");
        Button server = new Button("Server");
        Button design = new Button("Design");
        leftMenu.getChildren().addAll(project, server, design);
        
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topMenu);
        borderPane.setLeft(leftMenu);

        Scene scene = new Scene(borderPane);
        window.setScene(scene);
        window.show();
    }
}
