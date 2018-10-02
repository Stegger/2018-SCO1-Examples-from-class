/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peterscandymanager;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author pgn
 */
public class BLLManager implements ICandyLogic
{
    
    public void feedJeppe(Candy candy)
    {
        //magic
    }

    public List<Candy> getAllCandy()
    {
        ArrayList<Candy> jeppesGoodieBag = new ArrayList<>();
//        LinkedList<Candy> jeppesGoodieBag = new LinkedList<>();
        return jeppesGoodieBag;
    }

    @Override
    public List<Candy> getAllCandy(double maximuPrice)
    {
        LinkedList<Candy> jeppesGoodieBag = new LinkedList<>();
        return jeppesGoodieBag;
    }

    @Override
    public void eatCandy(Candy candy)
    {
        
    }

    @Override
    public Candy createCandy(String name, double price)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
