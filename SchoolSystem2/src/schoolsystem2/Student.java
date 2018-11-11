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
public class Student extends Person
{
ArrayList<GradeInfo> gradeReport = new ArrayList<>();
String education;

    public Student(int id, String name, String email, String education)
    {
        super(id, name, email);
        this.education=education;
    }
    
    public ArrayList<GradeInfo> getGradeReport()
    {
        return gradeReport;
    }
    
    public String getEducation(){
        return education;
    }
    public double getAverageGrade()
    {
    /**
     * Returns NaN if the student has no grades. 
     * Otherwise it will return the average.
     */
    double averageGrade=0;
        for (int i = 0; i < gradeReport.size(); i++)
        {
        averageGrade+=gradeReport.get(i).getGrade();
        }
    if (averageGrade==0 && gradeReport.size()>0){
        return 0;}
    else{
        return averageGrade/gradeReport.size();}
    }
    
    public int getGrade(String subject){
    /**
     * Returns -10 if no grade is found. Else it
     * returns the grade of the given subject
     */
    
        
    int grade=-10;
    for (int i=0;i<gradeReport.size();i++)
        if (gradeReport.get(i).getSubject()==subject){
            grade=gradeReport.get(i).getGrade();
            return grade;}
    return grade;
    }
    
    public void addGrade(String subject, int grade)
    {
    gradeReport.add(new GradeInfo(subject, grade));
    }
    public String toString()
    {
    String studentinfo = String.format("%-4s%-25s%-25s%-20s%-4s", super.getId(), super.getName(), super.getEmail(), education, getAverageGrade()); 
    return studentinfo;
    }
          
}
