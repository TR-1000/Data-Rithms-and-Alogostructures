package date;
import java.time.Period;
import java.util.Date;

class EmployeeDetails {
	public int id;
	public String name;
	public Date dtJoining;
	
	public EmployeeDetails(String name, int id) {
		this.id = id;
		this.name = name;
		dtJoining = new Date();
	}
     
       // Getter and setter for all attributes except for dtJoining. 
       // dtJoining only has getter method no setter method.
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public Date getDtJoining() {
		return this.dtJoining;
	}
}

public class DateMutableDemo {
	 
    public static void main(String[] args) {
        // Create an instance of Employee
    	EmployeeDetails emp = new EmployeeDetails("emp1", 1);
    	
        // Get the joining date and print it
    	System.out.println(emp.getDtJoining());
    	
        // Using the setDate() method change the date to a new value
    	emp.dtJoining.setDate(9);
    	
        // Print the employee joining date.
    	System.out.println(emp.getDtJoining());
    	
    	Period period = Period.of(1, 5, 2001);
	       System.out.println(period.getDays());
    }
}