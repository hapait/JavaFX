package javafxlearning;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CheckBoxTest {
    public static void Display(){
        Stage window = new Stage();
        window.setTitle("Grid Page");
        window.setMinWidth(250);
        
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(8);
        
        CheckBox agree = new CheckBox("Do you agree to terms & condition?");
        agree.setOnAction(e->{
            System.out.println("agreed: " + agree.isSelected());
        });
        GridPane.setConstraints(agree, 0, 0);
        
        CheckBox news = new CheckBox("Subscribe to our newsletter");
        GridPane.setConstraints(news, 0, 1);
        news.setOnAction(e->{
            System.out.println("Newsletter "+ (news.isSelected()? "subscribed": "not subscribed"));
        });
        Button create = new Button("Create");
        GridPane.setConstraints(create, 0, 2);
        
        grid.getChildren().addAll(agree, news, create);
        Scene scene = new Scene(grid);
        window.setScene(scene);
        window.show();
    }
}
