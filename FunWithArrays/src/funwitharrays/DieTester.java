/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwitharrays;

/**
 *
 * @author pgn
 */
public class DieTester
{
    
    public void rollADice(int times)
    {
        Die[] dies = new Die[10];
        //Initializes my dies:
        for(int i = 0; i<dies.length; i++)
        {
            dies[i] = new Die();
        }
        
        //Roll all dies "times" times... 
        for(int i = 0; i < times; i++)
        {
            for (Die die : dies)
            {
                die.roll();
            }
        }
        
        for (Die dy : dies)
        {
            System.out.println("Rolls: " + dy.totalNumberOfRolls() + "Share of sixes: " + dy.getEyeFrequency(6));
        }
        
    }
    
    
}
