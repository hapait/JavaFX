package javafxlearning;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class DropdownMenuTest {
    public static void Display(){
        Stage window = new Stage();
        window.setTitle("Grid Page");
        window.setMinWidth(250);
        
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(8);
        
        ChoiceBox<String> choiceBox = new ChoiceBox();
        choiceBox.getItems().add("Apple");
        choiceBox.getItems().add("Dell");
        choiceBox.getItems().addAll("Hp", "Acer");
        choiceBox.setValue("Apple");

        /*
        choiceBox.setOnAction(e->{
            System.out.println("Selected Brand: "+ choiceBox.getValue());
        });*/
        choiceBox.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue)-> {
            System.out.println("Old: "+ oldValue);
            System.out.println("New: "+newValue);
        });
        GridPane.setConstraints(choiceBox, 0, 0);
        
        grid.getChildren().addAll(choiceBox);
        Scene scene = new Scene(grid);
        window.setScene(scene);
        window.show();
    }
}
