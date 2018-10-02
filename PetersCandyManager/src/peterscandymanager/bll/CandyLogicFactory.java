/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peterscandymanager.bll;

import java.util.HashMap;

/**
 *
 * @author pgn
 */
public class CandyLogicFactory
{
    public static final String I_DONT_LIKE_CANDY = "I don't like candy";
    public static final String I_LIKE_SUGAR = "I like sugar";
    public static final String I_LIKE_YUMMY = "I like yummy";
    
    private static final HashMap<String, ICandyLogic> instantiatedCandyLogic =  new HashMap<>();
    
    public static ICandyLogic getCandyLogic(String name)
    {
        if(instantiatedCandyLogic.containsKey(name))
            return instantiatedCandyLogic.get(name);
        else
        {
            ICandyLogic newCandyLogic;
            switch (name)
            {
                case I_DONT_LIKE_CANDY:
                    newCandyLogic = new IDontLikeCandyMgr();
                    instantiatedCandyLogic.put(name, newCandyLogic); 
                    return newCandyLogic;
            }
        }
        return null;
    }
    
}
