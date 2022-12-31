import java.io.Serializable;
import java.util.Set;

public class Student implements Serializable {
    private int studentId;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    //private Set<Course> courses;
    private int age;
    //Code for getter and setter methods
    
    public Student(int studentId, String firstName, String lastName, String dateOfBirth, int age) {
 
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        //this.courses = courses;
        this.age = age;
    }
    
 
 
}