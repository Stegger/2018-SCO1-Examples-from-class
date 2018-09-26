/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithnumbers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author pgn
 */
public class TemperatureConversionController implements Initializable
{

    @FXML
    private TextField txtTempIn;
    @FXML
    private Label lblTempOut;
    @FXML
    private ComboBox<String> comboConversion;

    private NumberConversionModel ncModel = new NumberConversionModel();
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        comboConversion.setItems(FXCollections.observableArrayList("Celcius to Fahrenheit", "Fahrenheit to Celcius"));
        comboConversion.setVisibleRowCount(2);
    }

    @FXML
    private void handleTemperatureSelection(ActionEvent event)
    {
        if(comboConversion.getSelectionModel().getSelectedItem().equals("Celcius to Fahrenheit"))
        {
            
        }
        else
        {
            
        }
    }

}
