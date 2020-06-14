package javafxlearning;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

public class Controller implements Initializable{
    @FXML
    private void handleButtonAction(ActionEvent event){
        System.out.println("wow it's working");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("Loading data...");
    }
}
