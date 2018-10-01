/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwitharrays;

import java.util.Random;

/**
 *
 * @author pgn
 */
public class ArrayOperations
{

    private int[] numbers;

    /**
     * Create an instance of the ArrayOperations class, containing an array of length numberOfElements.
     * @param numberOfElements The length to initialize numbers with.
     */
    public ArrayOperations(int numberOfElements)
    {
        numbers = new int[numberOfElements];
        Random rnd = new Random();
        for(int i = 0; i < numbers.length;i++)
        {
            numbers[i] = rnd.nextInt();
        }
    }

    /**
     * Create an instance of the ArrayOperations class, containing an array of length numberOfElements. Also initializes values of number to be random values in the interval between minimumValue and maximumValue.
     * @param numberOfElements The length to initialize numbers with.
     * @param minimumValue The minimumValue the object can contain.
     * @param maximumValue The maximumValue the object can contain.
     */
    public ArrayOperations(int numberOfElements, int minimumValue, int maximumValue)
    {
        //What todo?
    }

    public void printArray()
    {
        //What todo?
    }

}
