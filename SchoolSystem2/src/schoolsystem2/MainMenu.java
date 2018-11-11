/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolsystem2;

/**
 *
 * @author Philip
 */
public class MainMenu extends Menu
{

    public MainMenu(String header, int exit, String... menuItems)
    {
        super(header, exit, menuItems);
    }



    @Override
    protected void doAction(int option)
    {
        String print="";
        print+="Option: "+option+" was selected";
        System.out.println(""+print);
        pause();
    }
    
}
