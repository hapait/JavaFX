package javafxlearning;

import java.util.ArrayList;
import java.util.List;
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
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TreeViewTest {
    
    public static void Display(){
        Stage window = new Stage();
        window.setTitle("Grid Page");
        window.setMinWidth(250);
        
        StackPane lay = new StackPane();
        
        TreeView<String> tree;
        TreeItem<String> root, sourcePackages, testPackages;
        
        root = new TreeItem<>("Root");
        root.setExpanded(true);
        
        sourcePackages = new TreeItem<>("Source Packages");
        sourcePackages.setExpanded(true);
        sourcePackages.getChildren().add(new TreeItem<>("main.java"));
        sourcePackages.getChildren().add(new TreeItem<>("login.java"));
        
        testPackages = new TreeItem<>("Test Packages");
        testPackages.setExpanded(true);
        testPackages.getChildren().add(new TreeItem<>("main.test"));
        testPackages.getChildren().add(new TreeItem<>("login.test"));
        
        root.getChildren().addAll(sourcePackages, testPackages);
        
        tree = new TreeView<>(root);
        tree.setShowRoot(false);
        tree.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        tree.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue)->{
            if(newValue != null){
                TreeItem<String> temp;
                temp = newValue;
                String path = "";
                ArrayList<String> l = new ArrayList<String>();
                while(temp.getParent() != null){
                    //System.out.println(temp.getValue());
                    l.add(temp.getValue());
                    temp = temp.getParent();
                }
                for(int i=l.size()-1;i>=0;i--){
                    System.out.print(l.get(i) + "/");
                }
            }
        });
        lay.getChildren().addAll(tree);
        Scene scene = new Scene(lay);
        window.setScene(scene);
        window.show();
    }
}
