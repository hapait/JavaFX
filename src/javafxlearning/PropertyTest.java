package javafxlearning;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PropertyTest {
    
    public static void Display(){
        Stage window = new Stage();
        window.setTitle("Property Test Page");
        window.setMinWidth(250);
        window.setMinHeight(400);
        
        VBox lay;

        Student std = new Student();
        std.setName("Rubel");
        std.getNameProperty().addListener((v, oldValue, newValue)->{
            System.out.println(oldValue + " >> " + newValue);
            System.out.println("Name Property: "+ std.getNameProperty());
            System.out.println("Current name: "+ std.getName());
        });
        
        IntegerProperty x = new SimpleIntegerProperty(5);
        IntegerProperty y = new SimpleIntegerProperty();
        y.bind(x.multiply(5));
        System.out.println("X: "+ x.getValue() + " | Y: " + y.getValue());
        x.setValue(20);
        System.out.println("X: "+ x.getValue() + " | Y: " + y.getValue());
        
        Button b = new Button("Change Name");
        b.setOnAction(e->{
            std.setName(std.getName()+ "x");
        });
        
        TextField input = new TextField();
        Label one = new Label("Welcome");
        Label two = new Label();
        HBox hb = new HBox(one, two);
        hb.setAlignment(Pos.CENTER);
        
        two.textProperty().bind(input.textProperty());
        
        //lay.getChildren().addAll(b, input, hb);
        lay = new VBox(10, b, input, hb);
        lay.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(lay);
        window.setScene(scene);
        window.show();
    }
}