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
public class TestClass
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
  
     SchoolMenu nyMenu = new SchoolMenu("School system",0,"Add Student","Show all students","Add Teacher","Show all teachers","Add grade to student","Add subject to teacher");
     nyMenu.run();
     
    }
    
}
