/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peterscandymanager.bll;

import java.util.ArrayList;
import java.util.List;
import peterscandymanager.be.Candy;

/**
 *
 * @author pgn
 */
public class IDontLikeCandyMgr implements ICandyLogic
{

    private ArrayList<Candy> candies;

    public IDontLikeCandyMgr()
    {
        candies = new ArrayList<>();
    }

    @Override
    public List<Candy> getAllCandy()
    {
        return candies;
    }

    /**
     * 
     * @param candy 
     */
    public void addCandy(Candy candy)
    {
        candies.add(candy);
    }

    @Override
    public Candy createCandy(String name, double yummy, double sugar)
    {
        Candy candy = new Candy(name, 10, yummy, sugar);
        return candy;
    }

}
