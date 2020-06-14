package javafxlearning;

import java.io.File;
import static javafx.application.Application.STYLESHEET_CASPIAN;
import static javafx.application.Application.setUserAgentStylesheet;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CSSTest {
    
    public static void Display(){
        Stage window = new Stage();
        window.setTitle("CSSTest Page");
        window.setMinWidth(250);
        window.setMinHeight(400);
        
        VBox lay = new VBox();

        Label l = new Label("Name");
        //l.setStyle("-fx-text-fill: #999fff");
        TextField t = new TextField();
        Button b = new Button("Change Theme");
        b.setOnAction(e->{
            //setUserAgentStylesheet(STYLESHEET_CASPIAN);
        });
        
        Button like = new Button("Like");
        like.getStyleClass().add("button-social");
        
        Button hate = new Button("Hate");
        hate.setId("hate-button");
        
        lay.getChildren().addAll(l, t, b, like, hate);
        
        Scene scene = new Scene(lay);
        // need to be placed under src folder
        scene.getStylesheets().add("Biodome.css");
        window.setScene(scene);
        window.show();
    }
}
