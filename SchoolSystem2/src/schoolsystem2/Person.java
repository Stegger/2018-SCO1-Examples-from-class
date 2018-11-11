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
abstract class Person
{
private int id;
private String name;
private String email;

public Person (int id, String name)
{
    this(id,name,"");
}


public Person(int id, String name, String email){
this.id=id;
this.name=name;
this.email=email;
}


public String toString()
{
String print;
print= ""+id+"  "+name+"  "+email;

return print;

}

public int getId()
{
return id;
}

public String getName()
{
return name;
}

public String getEmail()
{
return email;
}

public void setName(String name)
{
this.name=name;
}

public void setEmail(String mail)
{
this.email=mail;
}

public boolean equals(Person p)
{
if (p.getId()==this.getId()){
    return true;}
else{
    return false;}
}



}