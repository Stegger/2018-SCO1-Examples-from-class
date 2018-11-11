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
public class PersonManager
{
private ArrayList<Person> persons;

public PersonManager()
{
persons= new ArrayList<>();
}

public Person getPerson(int id)
{

for (int i=0;i<persons.size();i++)
    if (persons.get(i).getId()==id)
        return persons.get(i);
return null;
}

public void addPerson(Person p){

for (int i=0;i<persons.size();i++)
    if (persons.get(i).getId()==p.getId()){
        break;}


persons.add(p);
}


public void removePerson(int id){
for (int i=0;i<persons.size();i++)
    if (persons.get(i).getId()==id) 
        persons.remove(i);    
}

public ArrayList<Person> getAllPerson(){
return persons;   
}

public ArrayList<Student> getAllStudents()
{

ArrayList<Student> studentList = new ArrayList<>();

for (int i = 0;i<persons.size();i++)
    if (persons.get(i).getClass()==Student.class)
        studentList.add((Student) persons.get(i));
        
return studentList;  
}
public ArrayList<Teacher> getAllTeachers()
{
ArrayList<Teacher> teacherList = new ArrayList<>();

for (int i = 0;i<persons.size();i++)
    if (persons.get(i).getClass()==Teacher.class)
        teacherList.add((Teacher) persons.get(i));
return teacherList;     
}

public void operation(){
    
}


}
