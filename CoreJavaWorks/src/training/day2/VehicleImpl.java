package training.day2;

public class VehicleImpl {
	public static void main(String[] args) { 
		Vehicle[] vehicles = new Vehicle[5];
		vehicles[0] = new BMW(2, FuelType.PETROL, "Sony");
		vehicles[1] = new Maruti(4,  FuelType.DIESEL, "BS4");
		vehicles[2] = new BMW(5, FuelType.DIESEL, "Sony");
		vehicles[3] = new BMW(4, FuelType.PETROL, "Sony");
		vehicles[4] = new Maruti(4,  FuelType.PETROL, "BS4");
		DisplayVehicle.showVehicle(vehicles);
	}
}
