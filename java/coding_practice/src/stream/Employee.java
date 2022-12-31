package stream;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	private int sal;

	public Employee(String name, int sal) {
		this.name = name;
		this.sal = sal;
	}

	public String toString() {
		return name + " $" + sal;
	}

	public int applyInc(Function<Employee, Integer> function) {
		return function.apply(this);
	}

//	public int applyInc(int percentage) {
//		return sal * percentage;
//	}

	public void sortEmployeesByCountry(List<Employee> empList) {
		empList.sort((Employee e1, Employee e2) -> e1.getName().compareTo(e2.getName()));
	}

}

class EmployeeStarter {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Joey", 30000));
		empList.add(new Employee("Chris", 20000));
		empList.add(new Employee("Samuel", 50000));
		empList.add(new Employee("Brian", 30000));
		empList.add(new Employee("Roger", 60000));
		// System.out.println(employee.applyInc(2));// calling the method of Employee
		// that doubles the salary
		// System.out.println(employee.applyInc(e1 -> e1.getSal() * 2));// line-1

		Stream<Employee> empStream = empList.stream();
		empStream.forEach(e -> System.out.println(e));

		Stream<Employee> empFilter = empList.stream();
		empFilter.filter(emp -> emp.getSal() > 30000).forEach(System.out::println);

		//displaying the data after applying filter and increasing salary
        System.out.println("*****Data after applying filter and increasing salary*****");
		List<Employee> lstEmp = empList;
		List<Employee> lstNewEmp = lstEmp.stream().filter(emp -> emp.getSal() > 20000).map(e -> {
			e.setSal(e.getSal() + 5000);
			return e;
		}).collect(Collectors.toList());
		
		lstNewEmp.forEach((e) -> System.out.println(e.getName() + ":" + e.getSal()));
		
		Optional<Integer> max = lstNewEmp.stream().map(e->e.getSal())
	            .reduce(Integer::max);    // Finding the maximum salalry
	        List<Employee> lstMaxEmp =  lstNewEmp.stream()
	            .filter(e -> e.getSal().equals(max.get()))    // Finding employees with the maximum salary
	            .collect(Collectors.toList());
	 
	        System.out.println("\nEmployees having maximum salary after increment:");
	        lstMaxEmp.forEach(e -> System.out.println(e.getName() + ":" + e.getSal())); 
	}

}