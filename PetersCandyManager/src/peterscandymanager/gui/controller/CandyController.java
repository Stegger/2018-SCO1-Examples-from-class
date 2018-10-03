/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peterscandymanager.gui.controller;

import peterscandymanager.be.Candy;
import peterscandymanager.bll.ICandyLogic;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import peterscandymanager.bll.CandyLogicFactory;

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
    @FXML
    private ComboBox<String> comboMgr;

    public CandyController()
    {
        
        manager = CandyLogicFactory.getCandyLogic(CandyLogicFactory.I_LIKE_SUGAR);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        String[] managers = CandyLogicFactory.getAllManagerNames();
        for (String mgr : managers)
        {
            comboMgr.getItems().add(mgr);
        }
    }

    @FXML
    private void handleAddCandy(ActionEvent event)
    {
        String name = txtName.getText();
        double yummy = sliderYumminess.getValue();
        double sugar = sliderSugar.getValue();
        String mgr = comboMgr.getSelectionModel().getSelectedItem();
        manager = CandyLogicFactory.getCandyLogic(mgr);
        Candy candy = manager.createCandy(name, yummy, sugar);
        lstCandy.getItems().add(candy);
    }

}
