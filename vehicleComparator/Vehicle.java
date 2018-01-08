package vehicleComparator;

public class Vehicle {
	private int engineSize;
	private String vehicleName;
	
	public Vehicle(String name, int size) {
		engineSize = size;
		vehicleName = name;
	}
	
	public int getEngineSize() {
		return engineSize;
	}
	
	public String getVehicleName() {
		return vehicleName;
	}
	
	public String toString() {
		return "\nName of vehicle: "+ getVehicleName() + ". Engine size: " + getEngineSize();
	}
}
