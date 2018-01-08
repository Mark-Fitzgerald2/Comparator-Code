package employeeComparator;

public class Employee {
	private int id;
	private String empName;
	private double salary;
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.empName = name;
		this.salary = salary;
	}
	
	public int getID() {
		return id;
	}
	public String getName() {
		return empName;
	}
	public double getSalary() {
		return salary;
	}
	
	public String toString() {
		return "Name: " + getName() + ". ID: " + getID() + ". Salary: " + getSalary();
	}
}
