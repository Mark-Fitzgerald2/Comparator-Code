package employeeComparator;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		Employee mark = new Employee(7, "Mark", 450.0);
		Employee david = new Employee(2, "David", 212.5);
		Employee luke = new Employee(12, "Luke", 375.75);
		Employee derek = new Employee(1, "Derek", 425.5);
		Employee kev = new Employee(3, "Kev", 412.0);
		
		list.add(mark);
		list.add(david);
		list.add(luke);
		list.add(derek);
		list.add(kev);
		
		System.out.println("\nUnsorted array: ");
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		Collections.sort(list, new EmpComparator());
		System.out.println("\nSorted array: ");
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
