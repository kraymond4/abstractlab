package lab2;



/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class AdvancedJavaCourse implements CourseOutline
{
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber, double credits, String prerequisites) 
    {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
        this.setPrerequisites(prerequisites);
    }

    public String getCourseNumber() 
    {
        return courseNumber;
    }

    public final void setCourseNumber(String courseNumber) 
    {
        //needs validation
        this.courseNumber = courseNumber;
    }

    public double getCredits() 
    {
        return credits;
    }

    public void setCredits(double credits) 
    {
        //needs validation
        this.credits = credits;
    }

    public String getPrerequisites() 
    {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) 
    {
        //needs validation
        this.prerequisites = prerequisites;
    }

    public String getCourseName() 
    {
        return courseName;
    }

    public final void setCourseName(String courseName) 
    {
        //needs validation
        this.courseName = courseName;
    }

    
}
