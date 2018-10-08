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
     * Create an instance of the ArrayOperations class, containing an array of
     * length numberOfElements.
     *
     * @param numberOfElements The length to initialize numbers with.
     */
    public ArrayOperations(int numberOfElements)
    {
        numbers = new int[numberOfElements];
        Random rnd = new Random();
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = rnd.nextInt();
        }
    }

    /**
     * Create an instance of the ArrayOperations class, containing an array of
     * length numberOfElements. Also initializes values of number to be random
     * values in the interval between minimumValue and maximumValue.
     *
     * @param numberOfElements The length to initialize numbers with.
     * @param minimumValue The minimumValue the object can contain. (Inclusive)
     * @param maximumValue The maximumValue the object can contain. (Inclusive)
     */
    public ArrayOperations(int numberOfElements, int minimumValue, int maximumValue)
    {
        numbers = new int[numberOfElements];
        Random rnd = new Random();
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = rnd.nextInt(maximumValue - minimumValue + 1) + minimumValue;
        }
    }

    /**
     * Counts the number of occurrences of the number number.
     *
     * @param number The number to search for.
     * @return The count of the number value in the numbers array.
     */
    public int getNumberOf(int number)
    {
        int countOfNumber = 0; //We initialise the count to zero.
        for (int nr : numbers)
        {
            if (nr == number)
            {
                countOfNumber++;
            }
        }
        return countOfNumber;
    }

    /**
     * Returns a formatted view of the numbers in the array.
     *
     * @return
     */
    public String printArray()
    {
        String output = "{ ";
        for (int x : numbers)
        {
            output += x + " ";
        }
        output += "}";
        return output;
    }

    /**
     * Reverses the values in the numbers array.
     */
    public void reverse()
    {
        int tmp;
        for (int i = 0; i < numbers.length / 2; i++)
        {
            tmp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = tmp;
        }
    }

}
