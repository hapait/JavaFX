package javafxlearning;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ComboboxTest {
    
    ComboBox<String> combo;
    public void Display(){
        Stage window = new Stage();
        window.setTitle("Grid Page");
        window.setMinWidth(250);
        
        StackPane lay = new StackPane();
        
        combo = new ComboBox<>();
        combo.getItems().addAll("Hp", "Acer", "Dell", "Acer");
        combo.setPromptText("Select Brand");
        combo.setEditable(true);
        combo.setOnAction(e->{
            System.out.println("Brand: "+combo.getValue());
        });
        
        lay.getChildren().addAll(combo);
        Scene scene = new Scene(lay);
        window.setScene(scene);
        window.show();
    }
}
