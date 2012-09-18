/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author kraymond4
 */
public class StartUp 
{
    public static void main(String[] Args)
    {
        Course basic = new IntroToProgrammingCourse("Programming for dummies", "5554821814", 4.0);
        
        System.out.println(basic.getCourseName() + " is now in session.");
    }
}
