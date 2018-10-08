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
public class Die
{

    private int nrOfRolls = 0;
    private int[] eyeCount = new int[6];

    public Die()
    {
    }

    public void reset()
    {
        eyeCount = new int[6];
        nrOfRolls = 0;
    }

    public int getEyeCount(int eyeNumber)
    {
        return eyeCount[eyeNumber - 1];
    }

    public int totalNumberOfRolls()
    {
        return nrOfRolls;
    }

    public double getEyeFrequency(int eyeNumber)
    {
        return (double)getEyeCount(eyeNumber)/(double)totalNumberOfRolls();
    }

    public int roll()
    {
        nrOfRolls++;
        int eye = (int) (Math.random() * 6) + 1;
        int i = eye - 1;
        int rolls = eyeCount[i];
        rolls++;
        eyeCount[i] = rolls;
        return eye;
    }

}
