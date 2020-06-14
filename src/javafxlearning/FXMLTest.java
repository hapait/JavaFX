package javafxlearning;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FXMLTest {
    public void Display(){
        Stage window = new Stage();
        window.setTitle("FXML Test Page");
        window.setMinWidth(250);
        window.setMinHeight(400);
        
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("FXMLDesign.fxml"));
        } catch (IOException ex) {
            System.out.println("error heppening");
            Logger.getLogger(FXMLTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Scene scene = new Scene(root);
        window.setScene(scene);
        window.show();
    }
}
