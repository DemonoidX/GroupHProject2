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
    Semester sem;
    
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

    public Semester getSem() {
        return sem;
    }

    public void setSem(Semester sem) {
        if(this.sem == sem) {
            return;
        }
        //check if the course is already assigned
        //to another semester
        if(this.sem != null) {
            this.sem.removeCourse(this);
        }
        
        this.sem = sem;
    }
    
    @Override
    public String toString() {
        String tmp = name;
        if(done) {
            tmp = tmp + " (completed)";
        }
        else {
            tmp= tmp +" " + credit;
        }
        
        return tmp;
        
    } // end toString
}
