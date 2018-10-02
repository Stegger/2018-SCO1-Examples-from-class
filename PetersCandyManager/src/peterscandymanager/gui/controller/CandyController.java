/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peterscandymanager.gui.controller;

import peterscandymanager.be.Candy;
import peterscandymanager.bll.ICandyLogic;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import peterscandymanager.bll.IDontLikeCandyMgr;

/**
 *
 * @author pgn
 */
public class CandyController implements Initializable
{

    private ICandyLogic manager;

    @FXML
    private Button button;
    @FXML
    private ListView<Candy> lstCandy;
    @FXML
    private Slider sliderYumminess;
    @FXML
    private TextField txtName;
    @FXML
    private TextField txtPrice;
    @FXML
    private Slider sliderSugar;

    public CandyController()
    {
        manager = new IDontLikeCandyMgr();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }

    @FXML
    private void handleAddCandy(ActionEvent event)
    {
        String name = txtName.getText();
        double yummy = sliderYumminess.getValue();
        double sugar = sliderSugar.getValue();
        Candy candy = manager.createCandy(name, yummy, sugar);
        lstCandy.getItems().add(candy);
    }

}
