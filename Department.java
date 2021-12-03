import java.util.*;

public class Department {
    private String name; // the name of school Dept of Computing and Info Science
    private String id; // short name for courses SOFE, ELEE, STAT, etc
    private Vector<Course> courseList; // all courses offered by the department
    private Vector<Student> registerList; // all students taking courses in the department.

    //constructors
    public Department(String name, String id) {
        this.name = name;
        this.id = id;
        this.courseList = new Vector<Course>();
        this.registerList = new Vector<Student>();
    }

    //adding students
    public void addStudent(Student student){
        if (!registerList.contains(student)){//checking if student is in dept already or not, if not then add to registerList
            registerList.add(student);
        }
    }

    //DEPT name getter
    public String getName() {
        return name;
    }

    //getter for short name for courses (SOFE, ELEE)
    public String getId() {
        return id;
    }

    //courses offered in department
    public void offerCourse(Course course){
        courseList.add(course);
    }//adding specific courses to a dept

    //printing offered courses by the dept
    public void printCoursesOffered (){
        for (int i = 0; i < courseList.size(); i++){
            System.out.println(courseList.get(i).toString());
        }
    }

    //list of registered students in the dept
    public void printStudentsByName(){
        for (int i = 0; i < registerList.size(); i ++){
            System.out.println(registerList.get(i).toString());
        }
    }
    //checking if student is registered in this dept
    public boolean isStudentRegistered(Student student){
        if (registerList.contains(student)){
            return true;
        }
        return false;
    }
    //output
    public String toString() {
        // returns a string representation of department name, number
        // of courses offered and number of students registered in the
        // department. Use the format:
        // ECSE: 53 courses, 460 students
        return this.id +": " + this.courseList.size() + " courses, " + this.registerList.size() + " students";
    }
}
