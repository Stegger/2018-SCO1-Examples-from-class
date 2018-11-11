/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolsystem2;



import java.util.Scanner;

/**
 *
 * @author Philip
 */
public class SchoolMenu extends Menu
{
PersonManager Pmanager = new PersonManager();
Scanner scan = new Scanner(System.in);


    public SchoolMenu(String header, int exit, String... menuItems)
    {
        super(header, exit, menuItems);
    }

    @Override
    protected void doAction(int option)
    {
        if (option ==1)
            addStudent();
        if (option ==2)
            showStudents();
        if (option==3)
            addTeacher();
        if (option==4)
            showTeachers();
        if (option==5)
            addGrade();
        if (option==6)
            addSubject();
        
    }

    private void addStudent()
    {
        System.out.println("Type ID");
        int id=Integer.parseInt(scan.nextLine());
        System.out.println("Type name");
        String name=scan.nextLine();
        System.out.println("Type email");
        String email=scan.nextLine();
        System.out.println("Type education");
        String education=scan.nextLine();
        
        System.out.println("Student added\n\n\n");
        Pmanager.addPerson(new Student(id,name,email,education));
        
    }

    private void showStudents()
    {
        System.out.println("Student list");
        for (int i=0;i<Pmanager.getAllStudents().size();i++)
        {
            System.out.println(""+Pmanager.getAllStudents().get(i).toString());
        }
        
        super.pause();
    }

    private void addTeacher()
    {
        System.out.println("Type ID");
        int id=Integer.parseInt(scan.nextLine());
        System.out.println("Type name");
        String name=scan.nextLine();
        System.out.println("Type email");
        String email=scan.nextLine();
        System.out.println("Type initials");
        String initials=scan.nextLine();
        
        System.out.println("Teacher added\n\n\n");
        Pmanager.addPerson(new Teacher(id,name,email,initials));
    }

    private void showTeachers()
    {
        System.out.println("Teacher list");
        for (int i=0;i<Pmanager.getAllTeachers().size();i++)
        {
            System.out.println(""+Pmanager.getAllTeachers().get(i).toString());
        }

        super.pause();
        
    }

    private void addGrade()
    {
        System.out.println("Type student ID");
        int studentID=Integer.parseInt(scan.nextLine());
        System.out.println("Type subject");
        String subject=scan.nextLine();
        System.out.println("Type grade");
        int grade=Integer.parseInt(scan.nextLine());
        System.out.println("Grade added to Student \n\n\n"+studentID);
        Person gradeTo = Pmanager.getPerson(studentID);
        Student gradeToStudent = (Student)gradeTo;
        gradeToStudent.addGrade(subject, grade);
        

                
    }

    private void addSubject()
    {
        System.out.println("Type teacher ID");
        int teacherID=Integer.parseInt(scan.nextLine());
        System.out.println("Type subject to add");
        String subject=scan.nextLine();
        Person subjectTo = Pmanager.getPerson(teacherID);
        Teacher subjectToTeacher = (Teacher)subjectTo;
        subjectToTeacher.addSubject(subject);
       
        
    }
    
}
