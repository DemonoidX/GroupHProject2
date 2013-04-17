/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

/**
 *
 * @author Jonathan
 */
public class Course {
    String name;
    int credit;
    Course prereq;
    boolean done;
    Semesters sem;
    
    public Course() {
        name = "";
        credit = 0;
        prereq = null;
        done = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public Course getPrereq() {
        return prereq;
    }

    public void setPrereq(Course prereq) {
        this.prereq = prereq;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
