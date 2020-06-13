package javafxlearning;

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

public class MenuTest {
    
    public void Display(){
        Stage window = new Stage();
        window.setTitle("Grid Page");
        window.setMinWidth(250);
        window.setMinHeight(400);
        
        BorderPane lay = new BorderPane();

        Menu filemenu = new Menu("_File");
        MenuItem newProject = new MenuItem("New Project...");
        newProject.setOnAction(e->{
            System.out.println("Create new project");
        });
        //filemenu.getItems().add(new MenuItem("New Project"));
        filemenu.getItems().add(newProject);
        filemenu.getItems().add(new MenuItem("New File"));
        filemenu.getItems().add(new SeparatorMenuItem());
        filemenu.getItems().add(new MenuItem("Open Project"));
        filemenu.getItems().add(new MenuItem("Open File"));
        filemenu.getItems().add(new SeparatorMenuItem());
        filemenu.getItems().add(new MenuItem("Exit"));
        
        Menu editmenu = new Menu("_Edit");
        editmenu.getItems().add(new MenuItem("Cut"));
        editmenu.getItems().add(new MenuItem("Copy"));
        //editmenu.getItems().add(new MenuItem("Paste"));
        
        MenuItem paste = new MenuItem("Paste");
        newProject.setOnAction(e->{
            System.out.println("Pasting some text");
        });
        paste.setDisable(true);
        editmenu.getItems().add(paste);
        
        // help menu
        Menu help = new Menu("Help");
        CheckMenuItem lineNum = new CheckMenuItem("Show line number");
        lineNum.setOnAction(e->{
            if(lineNum.isSelected()){
                System.out.println("Selected line numbers");
            }else{
                System.out.println("Not showing line numbers");
            }
        });
        CheckMenuItem autosave = new CheckMenuItem("Autosave");
        autosave.setSelected(true);
        help.getItems().addAll(lineNum, autosave);
        
        //Debugger menu
        Menu debugger = new Menu("Debugger");
        ToggleGroup debugToggle = new ToggleGroup();
        
        RadioMenuItem gcc = new RadioMenuItem("GCC");
        RadioMenuItem libx = new RadioMenuItem("LIBX");
        RadioMenuItem fortran = new RadioMenuItem("Fortran");
        
        gcc.setToggleGroup(debugToggle);
        libx.setToggleGroup(debugToggle);
        fortran.setToggleGroup(debugToggle);
        
        debugger.getItems().addAll(gcc,libx,fortran);
        
        
        MenuBar menu = new MenuBar();
        menu.getMenus().addAll(filemenu,editmenu, help, debugger);
        
        Button b = new Button("ore button");
        VBox v = new VBox();
        v.getChildren().add(b);
        
        lay.setTop(menu);
        lay.setLeft(v);
        //lay.getChildren().addAll(b, menu);
        Scene scene = new Scene(lay);
        
        window.setScene(scene);
        window.show();
    }
}
