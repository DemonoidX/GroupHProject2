/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import java.util.Vector;

/**
 *
 * @author Jonathan
 */
public class Semester {
    String name;
    int maxCredits;
    int credits;
    Vector<Course> courses;
    
    Semester(String n) {
        name = n;
        maxCredits = 18;
        credits = 0;
        courses = new Vector<Course>();
    }
    
    void addCourse(Course c) {
        if(courses.contains(c))
            return;
        
        courses.add(c);
        credits += c.getCredit();
        
        c.setSem(this);
    }
    
    void removeCourse(Course c) {
        //is the course part of this semester?
        if(!courses.contains(c)) {
            return;
        }
        courses.remove(c);
        credits -= c.getCredit();
        c.setSem(null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxCredits() {
        return maxCredits;
    }

    public void setMaxCredits(int maxCredits) {
        this.maxCredits = maxCredits;
    }

    public Vector<Course> getCourses() {
        return courses;
    }

    public void setCourses(Vector<Course> courses) {
        this.courses = courses;
    }
    
    
    
} // end Semester
