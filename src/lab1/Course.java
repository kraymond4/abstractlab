/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Kyle Raymond
 * version: 1.0
 */
public abstract class Course 
{
    private String courseName;
    private String courseNumber;
    private double credits;
    
    public abstract String getCourseNumber();
    
    public abstract void setCourseNumber(String courseNumber);
    
    public abstract double getCredits();
    
    public abstract void setCredits(double credits);
    
    public abstract String getCourseName();
    
    public abstract void setCourseName(String courseName);
}
