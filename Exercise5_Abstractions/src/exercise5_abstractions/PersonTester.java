/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise5_abstractions;

import exercise5_abstractions.be.Person;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pgn
 */
public class PersonTester
{
    
    public void assignmentOneTest()
    {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(1, "Peter Stegger", "pgn@easv.dk"));
        persons.add(new Person(2, "Jeppe Led", "jml@easv.dk"));
        persons.add(new Person(3, "Stig S. Iversen", "ssi@easv.dk"));
        for (Person person : persons)
        {
            System.out.println(person.toString());
        }
    }
    
}
