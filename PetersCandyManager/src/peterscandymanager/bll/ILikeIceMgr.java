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
public class ILikeIceMgr implements ICandyLogic
{

    @Override
    public List<Candy> getAllCandy()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Candy createCandy(String name, double yummy, double sugar)
    {
        int x = 5;
        double price = name.contains("ice") ? 500 : 10;
        return new Candy(name, price, yummy, sugar);
    }

    
}
