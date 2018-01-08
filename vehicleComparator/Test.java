package vehicleComparator;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
	public static void main(String args[]) {
		Vehicle car = new Vehicle("car", 1500);
		Vehicle truck = new Vehicle("truck", 3000);
		Vehicle tractor = new Vehicle("tractor", 2750);
		Vehicle quadBike = new Vehicle("quad bike", 1000);
		Vehicle smallBoy = new Vehicle("small boy", 500);
		
		ArrayList<Vehicle> list = new ArrayList<Vehicle>();
		list.add(car);
		list.add(truck);
		list.add(tractor);
		list.add(quadBike);
		list.add(smallBoy);
		System.out.println("\nUnsorted Array:\n");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		Collections.sort(list, new VehicleComparator());
		System.out.println("\nSorted Array by size:\n");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
