package lab2;



/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroToProgrammingCourse implements CourseOutline
{
    private String courseName;
    private String courseNumber;
    private double credits;

    public IntroToProgrammingCourse(String courseName, String courseNumber, double credits) 
    {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
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
