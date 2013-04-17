/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import javax.swing.JFrame;

/**
 *
 * @author Jonathan
 */
public class Project2 {
    public static Course courses[] = new Course[3];
    public static Semester semesters[] = new Semester[4];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create some courses and semesters
        courses[0] = new Course();
        courses[0].setCredit(2);
        courses[0].setName("IFSC 1200");
        courses[0].setDone(true);
        
        courses[1] = new Course();
        courses[1].setCredit(3);
        courses[1].setName("IFSC 2300");
        courses[1].setPrereq(courses[0]);
        
        semesters[0] = new Semester("Spring 2014");
        semesters[1] = new Semester("Fall 2014");
        semesters[1].setMaxCredits(2);
        
        //create and link the panels
        TabbedPanel m = new TabbedPanel();
        CoursesPanel c = new CoursesPanel();
        SchedulePanel s = new SchedulePanel();
        
        for(int i = 0; i < courses.length; i++) {
            System.out.println(courses[i]);
        }
            
        
        m.jCoursesPanel.add(c);
        m.jSchedulePanel.add(s);
        
        c.mainPanel = m;
        c.sPanel = s;
        
        s.mainPanel = m;
        s.cPanel = c;
        
        JFrame f = new JFrame("Planner");
        f.setSize(900, 700);
        f.add(m);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
