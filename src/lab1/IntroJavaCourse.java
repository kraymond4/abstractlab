package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      Kyle Raymond
 * @version     1.05
 */
public class IntroJavaCourse extends Course {
    
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber, double credits, String prerequisites) 
    {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
        this.setPrerequisites(prerequisites);
    }

   

    

    


    public final String getPrerequisites() 
    {
        return prerequisites;
    }

    public final void setPrerequisites(String prerequisites) 
    {
        this.prerequisites = prerequisites;
    }

        
        

}
