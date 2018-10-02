/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peterscandymanager;

import java.util.List;

/**
 *
 * @author pgn
 */
public interface ICandyLogic
{
    
    public void feedJeppe(Candy candy);
    
    public List<Candy> getAllCandy();
    
    public List<Candy> getAllCandy(double maximuPrice);
    
    public void eatCandy(Candy candy);
    
    public Candy createCandy(String name, double price);
    
}
