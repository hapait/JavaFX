package javafxlearning;

import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ListViewTest {
    
    public static void Display(){
        Stage window = new Stage();
        window.setTitle("Grid Page");
        window.setMinWidth(250);
        
        StackPane lay = new StackPane();
        
        ListView list = new ListView<>();
        list.getItems().addAll("Iron man", "Ip man", "NFS");
        list.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        list.getSelectionModel().selectedItemProperty().addListener(e->{
            ObservableList<String> names = list.getSelectionModel().getSelectedItems();
            for(String s: names){
                System.out.println(s);
            }
        });
        
        lay.getChildren().addAll(list);
        Scene scene = new Scene(lay);
        window.setScene(scene);
        window.show();
    }
}
