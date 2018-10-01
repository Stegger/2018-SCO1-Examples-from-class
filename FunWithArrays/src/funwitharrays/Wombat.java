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
public class Wombat
{

    private String name;
    private int age;

    public Wombat(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    /**
     * Get the value of age
     *
     * @return the value of age
     */
    public int getAge()
    {
        return age;
    }

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Adds one year to the wombats birthday!
     */
    public void happyBirthday()
    {
        age++;
    }

}
