/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peterscandymanager.bll;

import java.util.List;
import peterscandymanager.be.Candy;

/**
 *
 * @author pgn
 */
public interface ICandyLogic
{

    public List<Candy> getAllCandy();

    public Candy createCandy(String name, double yummy, double sugar);

}