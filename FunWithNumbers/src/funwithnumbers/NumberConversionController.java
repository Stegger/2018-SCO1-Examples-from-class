/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithnumbers;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextInputDialog;

/**
 *
 * @author pgn
 */
public class NumberConversionController implements Initializable {

    private NumberConversionModel ncmodel = new NumberConversionModel();

    @FXML
    private Label lblTest;
    
    @FXML
    private Label label;
    
    @FXML
    private Button button;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        TextInputDialog dialog = new TextInputDialog("");

        dialog.setTitle("Text Input Dialog");
        dialog.setContentText("Please enter your name:");

        Optional<String> result = dialog.showAndWait();
        
        if (result.isPresent()) 
        {
            String message = ncmodel.getGreetingsMessage(result.get());
            label.setText(message);
        }
    }

    @FXML
    private void handleButtonClick(ActionEvent event) 
    {
        lblTest.setText("JavaFX works");
    }

}