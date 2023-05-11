package compare_sort;
import java.util.*;

class Student implements Comparable<Student> {
	private String name;
	private Integer rollNumber;
	static Set<Student> studentTreeSet = new TreeSet<>();

	public Student(String name, int rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	// add toString() method
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNumber=" + rollNumber + "]";
	}

	// add appropriate method for avoiding duplicate Student
	public void addToSet() {
		studentTreeSet.add(this);
	}

	@Override
	public int compareTo(Student otherStudent) {
		System.out.println("comparing");
		return getRollNumber().compareTo(otherStudent.getRollNumber());
	}

	

}

class StudentNameCompare implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2) {
		return s1.getName().compareTo(s2.getName());
	}



}

public class StudentSortApp{
	public static void main(String[] args) {
		Student s1 = new Student("Joey", 9);
		Student s2 = new Student("Jesse", 2);
		Student s3 = new Student("J", 4);
		Student s4 = new Student("Zach", 6);
		Student s5 = new Student("Fred", 3);
		s1.addToSet();
		s2.addToSet();
		s3.addToSet();
		s4.addToSet();
		s5.addToSet();

		System.out.println(Student.studentTreeSet);
		
		Set<Student> students = new TreeSet<Student>(new StudentNameCompare());
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		System.out.println(students);
		
	}
}
