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
public class ILikeSugarCandyMgr implements ICandyLogic
{

    @Override
    public List<Candy> getAllCandy()
    {
        //TODO
        return null;
    }

    @Override
    public Candy createCandy(String name, double yummy, double sugar)
    {
        double price = 5 * sugar + yummy;
        return new Candy(name, price, yummy, sugar);
    }

}
