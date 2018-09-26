/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithloopsandifs;

/**
 *
 * @author pgn
 */
public class FunWithLoopsAndIfs
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {

        System.out.println("Pre loop");
        for (int i = 1; i <= 10; i++)
        {
            System.out.println("i is " + i);
        }
        System.out.println("For loop done!");

        System.out.println("Start while loop");
        int j = 1;

        while (j <= 10)
        {

            System.out.println("j is " + j);
            j++;
        }

        System.out.println("Terminate");
    }

    public static void doSomeIffyStuff()
    {
        int x = 5;
        int y = 8;
        boolean isThisTrue = false;

        if (x == 5 || isThisTrue && FunWithLoopsAndIfs.getIsABoy())
        {
            System.out.println("X == 5");
        } else if (isThisTrue)
        {
            System.out.println("X < 5");
        } else if (FunWithLoopsAndIfs.getIsABoy())
        {
            System.out.println("X > 5");
        }

        System.out.println("Hello world");
    }

    public static boolean getIsABoy()
    {
        return false;
    }

}
