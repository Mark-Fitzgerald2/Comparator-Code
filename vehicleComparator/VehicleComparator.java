package vehicleComparator;

import java.util.Comparator;

public class VehicleComparator implements Comparator<Vehicle> {
	@Override
	public int compare(Vehicle v1, Vehicle v2) {
		return v1.getEngineSize() - v2.getEngineSize();
	}
}
