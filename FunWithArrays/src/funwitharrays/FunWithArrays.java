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
public class FunWithArrays
{

    public static void exampleOne()
    {
        int[] manyNumbers = new int[4];
        manyNumbers[0] = 42;
        manyNumbers[1] = 7;
        manyNumbers[2] = 72;
        manyNumbers[3] = 11;
        int[] manyMoreNumbers = new int[5];
        //Copy elements from manyNumbers to manyMoreNumbers??
        for (int i = 0; i < 4; i++)
        {
            manyMoreNumbers[i] = manyNumbers[i];
        }
        //Print out manyMoreNumbers!!
        for (int x : manyMoreNumbers)
        {
            System.out.println("" + x);
        }
    }

    public static void exampleTwo()
    {
        int a = 43;
        int b = 34;
        a = b;
        b++;
        System.out.println("A is " + a);

        int[] numbers = new int[3];
        numbers[0] = 37;
        numbers[1] = 34;
        numbers[2] = 52;

        numbers[1] = a;
        numbers[0] = numbers[1];
        numbers[1]++;

        System.out.println("Index 0's value is: " + numbers[0]);

        Wombat[] manyWombats = new Wombat[3];
        manyWombats[0] = new Wombat("Jeppe", 37);
        manyWombats[1] = new Wombat("Peter", 34);
        manyWombats[2] = new Wombat("Stig", 52);

        System.out.println("Wombat a index 2's name is: " + manyWombats[2].getName());

        manyWombats[1] = new Wombat("Lars", 43);
        manyWombats[0] = manyWombats[1];

        manyWombats[1].happyBirthday();

        System.out.println("Wombat a index 0's name is: " + manyWombats[0].getName() + " and the age is " + manyWombats[0].getAge());

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
//        FunWithArrays.exampleOne(); //Runs the first example from class
//        FunWithArrays.exampleTwo(); //Runs the second example from class
        
        ArrayOperations arrOps = new ArrayOperations(50, 1, 10); 
        System.out.println(arrOps.printArray());
        
        int countOfFives = arrOps.getNumberOf(5);
        System.out.println("The amount og fives is " + countOfFives);
        
        
        
    }

}
