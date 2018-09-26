/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithstrings.gui.controller;

import funwithstrings.bll.GodOfString;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author pgn
 */
public class FXMLDocumentController implements Initializable
{

    @FXML
    private Button button;
    @FXML
    private TextField txtInput;
    @FXML
    private TextArea txtOutput;

    private GodOfString gos;

    @FXML
    private AnchorPane anchor;

    public FXMLDocumentController()
    {
        gos = new GodOfString();
    }

    @FXML
    private void handleButtonAction(ActionEvent event)
    {
        String input = txtInput.getText();
        String output = gos.getFirstNStrings(input);
        txtOutput.setText(output);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }

    @FXML
    private void onClickNext(ActionEvent event) throws IOException
    {
        while (true)
        {
            Parent root = FXMLLoader.load(getClass().getResource("/funwithstrings/gui/view/StudentPresenter.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage(); //Create a new stage aka. window.
//            Stage stage = (Stage) anchor.getScene().getWindow();
            stage.setScene(scene);

            Random rnd = new Random();
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            double width = screenSize.getWidth();
            double height = screenSize.getHeight();

            stage.setX(rnd.nextDouble() * width);
            stage.setY(rnd.nextDouble() * height);

            stage.show();
        }
    }

}
