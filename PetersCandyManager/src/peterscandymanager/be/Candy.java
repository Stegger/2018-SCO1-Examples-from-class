/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peterscandymanager.be;

/**
 *
 * @author pgn
 */
public class Candy
{

    private String name;

    private double price;

    private double yumminess;

    private double sugarPer100g;

    public Candy(String name, double price, double yumminess, double sugarPer100g)
    {
        this.name = name;
        this.price = price;
        this.yumminess = yumminess;
        this.sugarPer100g = sugarPer100g;
    }

    /**
     * Get the value of sugarPer100g
     *
     * @return the value of sugarPer100g
     */
    public double getSugarPer100g()
    {
        return sugarPer100g;
    }

    /**
     * Set the value of sugarPer100g
     *
     * @param sugarPer100g new value of sugarPer100g
     */
    public void setSugarPer100g(double sugarPer100g)
    {
        this.sugarPer100g = sugarPer100g;
    }

    /**
     * Get the value of yumminess
     *
     * @return the value of yumminess
     */
    public double getYumminess()
    {
        return yumminess;
    }

    /**
     * Set the value of yumminess
     *
     * @param yumminess new value of yumminess
     */
    public void setYumminess(double yumminess)
    {
        this.yumminess = yumminess;
    }

    /**
     * Get the value of price
     *
     * @return the value of price
     */
    public double getPrice()
    {
        return price;
    }

    /**
     * Set the value of price
     *
     * @param price new value of price
     */
    public void setPrice(double price)
    {
        this.price = price;
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
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Candy{" + "name=" + name + ", price=" + price + ", yumminess=" + yumminess + ", sugarPer100g=" + sugarPer100g + '}';
    }

}