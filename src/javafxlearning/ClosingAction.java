package javafxlearning;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ClosingAction {
    Stage window;
    public void display(String title, String message) {
        window = new Stage();
        
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);
        window.setOnCloseRequest(e->{
            e.consume();
            closeFunction();
        });
        Label label = new Label();
        label.setText(message);

        //Create two buttons
        Button closeButton = new Button("Close & save");
        closeButton.setOnAction(e->{
            closeFunction();
        });
        VBox layout = new VBox(10);

        //Add buttons
        layout.getChildren().addAll(label, closeButton);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
    }
    
    private void closeFunction(){
        //System.out.println("File Saved");
        boolean ans = ConfirmBox.display("Exit message", "Do you want to save before exit?");
        if(ans){
            System.out.println("Saved");
        }else{
            System.out.println("Not Saved");
        }
        window.close();
    }
}
