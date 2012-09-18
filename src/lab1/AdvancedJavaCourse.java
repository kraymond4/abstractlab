package lab1;



/**
 * Describe responsibilities here.
 *
 * @author      Kyle Raymond
 * @version     1.05
 */
public class AdvancedJavaCourse extends Course {
    
    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }

    


    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        
       
        this.prerequisites = prerequisites;
    }

   

    

    

    

    
    
}
