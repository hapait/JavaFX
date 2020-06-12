package javafxlearning;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ValidationTest {
    public static void Display(){
        Stage window = new Stage();
        window.setTitle("Validation Page");
        window.setMinWidth(250);
        
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(8);
        
        Label name = new Label("Username: ");
        GridPane.setConstraints(name, 0, 0);
        TextField nameText = new TextField("User name");
        GridPane.setConstraints(nameText, 1, 0);
        
        Label age = new Label("Age: ");
        GridPane.setConstraints(age, 0, 1);
        TextField ageText = new TextField();
        GridPane.setConstraints(ageText, 1, 1);
        
        Button login = new Button("Submit");
        login.setOnAction(e->{
            isInt(ageText, ageText.getText());
            //System.out.println(ageText.getText());
        });
        GridPane.setConstraints(login, 1, 2);
        
        grid.getChildren().addAll(name, nameText, age, ageText, login);
        Scene scene = new Scene(grid);
        window.setScene(scene);
        window.show();
    }
    
    private static boolean isInt(TextField input, String message){
        try{
            int age = Integer.parseInt(message);
            System.out.println("Age is "+ age);
            return true;
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
    }
}
