/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithnumbers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author pgn
 */
public class MainController implements Initializable
{

    @FXML
    private AnchorPane rootPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }    

    @FXML
    private void handleDistanceConversion(ActionEvent event) throws IOException
    {
//        Stage stage = new Stage();
        Stage stage = (Stage)rootPane.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("NumberConversion.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
//        stage.show();
    }

    @FXML
    private void handleTempConversion(ActionEvent event)
    {
    }

    @FXML
    private void handleBMICalc(ActionEvent event)
    {
    }
    
}
