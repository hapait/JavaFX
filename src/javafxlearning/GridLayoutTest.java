package javafxlearning;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridLayoutTest {
    public static void Display(){
        Stage window = new Stage();
        window.setTitle("Grid Page");
        window.setMinWidth(250);
        
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(8);
        
        Label name = new Label("Username: ");
        GridPane.setConstraints(name, 0, 0);
        TextField nameText = new TextField("User name");
        GridPane.setConstraints(nameText, 1, 0);
        
        Label pass = new Label("Password: ");
        GridPane.setConstraints(pass, 0, 1);
        TextField passText = new TextField();
        passText.setPromptText("password");
        GridPane.setConstraints(passText, 1, 1);
        
        Button login = new Button("Login");
        GridPane.setConstraints(login, 1, 2);
        
        grid.getChildren().addAll(name, nameText, pass, passText, login);
        Scene scene = new Scene(grid);
        window.setScene(scene);
        window.show();
    }
}
