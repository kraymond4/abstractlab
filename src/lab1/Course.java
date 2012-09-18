/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Kyle Raymond
 * version: 1.05
 */
public abstract class Course 
{
    private String courseName;
    private String courseNumber;
    private double credits;
    
    public final String getCourseNumber()
    {
        return courseNumber;
    }
    
    public final void setCourseNumber(String courseNumber)
    {
        // needs validation
        this.courseNumber = courseNumber;
    }
    
    public final double getCredits()
    {
        return credits;
    }
    
    public final void setCredits(double credits)
    {
        //needs validation
        this.credits = credits;
    }
    
    public final String getCourseName()
    {
        return courseName;
    }
    
    public final void setCourseName(String courseName)
    {
        //needs validation
        this.courseName = courseName;
    }
}
