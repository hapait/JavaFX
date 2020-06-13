package javafxlearning;

import javafx.collections.FXCollections;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TableViewTest {
    
    public static void Display(){
        Stage window = new Stage();
        window.setTitle("Grid Page");
        window.setMinWidth(250);
        
        StackPane lay = new StackPane();
        
        TableView<Product> table;
        
        TableColumn<Product, String> name = new TableColumn("Name");
        name.setMinWidth(200);
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        
        TableColumn<Product, Double> price = new TableColumn("Price");
        price.setMinWidth(200);
        price.setCellValueFactory(new PropertyValueFactory<>("Price"));
        
        TableColumn<Product, String> qty = new TableColumn("Qty");
        qty.setMinWidth(200);
        qty.setCellValueFactory(new PropertyValueFactory<>("Qty"));
        
        table = new TableView<>();
        table.setItems(getProducts());
        table.getColumns().addAll(name,price,qty);
        
        lay.getChildren().addAll(table);
        Scene scene = new Scene(lay);
        window.setScene(scene);
        window.show();
    }
    
    public static ObservableList<Product> getProducts(){
        ObservableList<Product> products = FXCollections.observableArrayList();
        products.add(new Product("Lehenga", 7000, 5));
        products.add(new Product("Panjabi", 2000, 5));
        products.add(new Product("Lungi", 19000, 5));
        return products;
    }
}
