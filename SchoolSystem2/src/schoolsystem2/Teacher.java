/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolsystem2;

import java.util.ArrayList;

/**
 *
 * @author Philip
 */
public class Teacher extends Person
{
ArrayList<String> subjects = new ArrayList<>();
String initials;
double salary;

    public Teacher(int id, String name, String email, String initials)
    {
        super(id, name, email);
        this.initials=initials;
        
    }
    
    public ArrayList<String> getSubjects()
    {
    return subjects;    
    }
    
    public String getInitials()
    {
        return initials;
    }
    public double getSalary()
    {
        return salary;
    }
    public void addSubject(String subject)
    {
        subjects.add(subject);
    }
    
    public void setSalary(double salary)
    {
    this.salary=salary;
    }
    
    public String toString()
    {
    String firstSubject="No Subjects";
    String print;
    if (!subjects.isEmpty()){
         firstSubject=subjects.get(0);}
    
    print=String.format("%-4s%-25s%-25s%-4s%-4s",super.getId(),super.getName(), super.getEmail(), initials, firstSubject);

    return print;
    }
}
