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
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TableViewTest {
    TableView<Product> table;
    
    public void Display(){
        Stage window = new Stage();
        window.setTitle("Grid Page");
        window.setMinWidth(250);
        
        VBox lay = new VBox();
        
        
        
        TableColumn<Product, String> name = new TableColumn("Name");
        name.setMinWidth(200);
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        
        TableColumn<Product, Double> price = new TableColumn("Price");
        price.setMinWidth(200);
        price.setCellValueFactory(new PropertyValueFactory<>("Price"));
        
        TableColumn<Product, String> qty = new TableColumn("Qty");
        qty.setMinWidth(200);
        qty.setCellValueFactory(new PropertyValueFactory<>("Qty"));
        
        TextField nameInput = new TextField();
        nameInput.setPromptText("Name");
        nameInput.setMinWidth(200);
        
        TextField priceInput = new TextField();
        priceInput.setPromptText("Price");
        
        TextField qtyInput = new TextField();
        qtyInput.setPromptText("Qty");
        
        Button addButton = new Button("Add");
        addButton.setOnAction(e->{
            addProduct(nameInput, priceInput, qtyInput);
        });
        Button deleteButton = new Button("Delete");
        deleteButton.setOnAction(e->{
            delete();
        });
        
        HBox hbox = new HBox();
        hbox.setPadding(new Insets(10,10,10,10));
        hbox.setSpacing(10);
        hbox.getChildren().addAll(nameInput, priceInput, qtyInput, addButton, deleteButton);
        
        table = new TableView<>();
        table.setItems(getProducts());
        table.getColumns().addAll(name,price,qty);
        
        lay.getChildren().addAll(table, hbox);
        Scene scene = new Scene(lay);
        window.setScene(scene);
        window.show();
    }
    
    public ObservableList<Product> getProducts(){
        ObservableList<Product> products = FXCollections.observableArrayList();
        products.add(new Product("Lehenga", 7000, 5));
        products.add(new Product("Panjabi", 2000, 5));
        products.add(new Product("Lungi", 19000, 5));
        return products;
    }

    private void addProduct(TextField nameInput, TextField priceInput,  TextField qty) {
        Product pro = new Product();
        pro.setName(nameInput.getText());
        pro.setPrice(Double.parseDouble(priceInput.getText()));
        pro.setQty(Integer.parseInt(qty.getText()));
        table.getItems().add(pro);
    }

    private void delete() {
        ObservableList<Product> productSelected, allProducts;
        allProducts = table.getItems();
        productSelected = table.getSelectionModel().getSelectedItems();
        productSelected.forEach(allProducts::remove);
    }
}
