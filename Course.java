import java.util.*;

public class Course {
    private Department dept;
    private String title; // title of the course (e.g. Intro to programming);
    private String code; // course code, e.g,. SOFE ELEE, MANE, etc.
    private int number; // course number, e.g. 1200, 2710, 2800, etc.
    private  Vector <Student>classList; // contains all students registered in this course

    //constructors
    public Course(String code, int number, Department dept, String title) {
        // also initialize the classList;
        this.code = code;
        this.number = number;
        this.dept = dept;
        this.title = title;
        this.classList = new Vector<Student>();
    }
    //dept getter
    public Department getDept (){
        return dept;
    }

    //class list getter
    public Vector<Student> getClassList() {
        return classList;
    }

    public Course() {
        // TODO Auto-generated constructor stub
    }

    //output
    public String toString() {
        // return a string representation of the course with the course code,
        // name, and number of people registered in the course in the following
        // format:
        // SOFE 2710 Object Oriented Programming and Design, Enrollment = 260
        return this.code + " " + this.number + " " + this.title + ", Enrollment = " + this.classList.size();
    }
}
