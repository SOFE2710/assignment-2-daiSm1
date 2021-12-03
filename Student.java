import java.util.*;

public class Student extends Person{
    private String id;
    private String name;
    private Vector courses; // contains all courses the student is registered in

    //constructors
    public Student(String stdName, String stdId) {
        this.name = stdName;
        this.id = stdId;
        this.courses = new Vector<Course>();
    }

    //name getter
    public String getName() {return name;}

    //ID getter
    public String getId() {
        return id;
    }

    //Students registering for courses
    public void registerFor (Course course) {
        if (!courses.contains(course)){
            courses.add(course);//add course to student's courses
            course.getClassList().add(this);//add student to course's students
            course.getDept().addStudent(this);//if not already, adding student in department
        }
    }

    // method to check if a student is registered in a course passed in argument
    public boolean isRegisteredInCourse (Course course){
        if (courses.contains(course)){
            return true;
        }
        return false;
    }

    //output
    public String toString() {
        // return a string representation of a student using the following format:
        // 100234546 John McDonald
        // Registered courses: ELEE 2110, ELEE 2790, SOFE 2710, SOFE 2800, SOFE 2850

        String output = this.id + " " + this.name + "\n" + "Registered courses: ";
        for (int i = 0; i < courses.size(); i++){
            output = output + courses.get(i) + ", ";
        }
        return output;
    }
}
