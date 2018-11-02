/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise5_abstractions.be;

/**
 *
 * @author pgn
 */
public class Person
{

    private int id;
    private String name;
    private String email;

    /**
     * Constructs
     *
     * @param id
     * @param name
     */
    public Person(int id, String name)
    {
        this(id, name, "");
    }

    /**
     * Constructs a person.
     *
     * @param id
     * @param name
     * @param email
     */
    public Person(int id, String name, String email)
    {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    /**
     * Get the value of email
     *
     * @return the value of email
     */
    public String getEmail()
    {
        return email;
    }

    /**
     * Set the value of email
     *
     * @param email new value of email
     */
    public void setEmail(String email)
    {
        this.email = email;
    }

    /**
     * Gets the name of the person.
     *
     * @return
     */
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    @Override
    public String toString()
    {
        String output = String.format("%-4s%-25s%-25s", id, name, email);
        return output;
    }

}
