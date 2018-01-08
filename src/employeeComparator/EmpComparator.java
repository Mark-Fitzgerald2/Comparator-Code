package employeeComparator;

import java.util.Comparator;
public class EmpComparator implements Comparator<Employee> {
	/*@Override
	public int compare(Employee e1, Employee e2) {
		return (int)(e1.getSalary()-e2.getSalary());
	}*/
	
	/*@Override
	public int compare(Employee e1, Employee e2) {
		return (int)(e1.getID()-e2.getID());
	}*/
	
	@Override
	public int compare(Employee e1, Employee e2) {
		if (e1.getName() == null) {
	        return -1;
	    }
	    if (e2.getName() == null) {
	        return 1;
	    }
	    if (e1.getName().equals( e2.getName() )) {
	        return 0;
	    }
	    return e1.getName().compareTo(e2.getName());
	}
	
}
