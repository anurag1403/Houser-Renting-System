package training.day2;

public class Maruti extends FourWheeler{
	
	private String engStd;
	
	public Maruti(int noOfDoors, FuelType fuelType, String engStd) {
		super(noOfDoors, fuelType);
		this.engStd = engStd;
	}

	public void engineStandard() {
		System.out.println("The Maruti is " + engStd);
	}

	public void doors() {
		System.out.println("This Maruti comes with "+ getNoOfDoors() + " doors");
	}

	public void fuelType() {
		System.out.println("Fuel type of maruti is " + getFuelType());
	}

	@Override
	public void move() {
		System.out.println("Maruti moves with manual gear");
	}

	@Override
	public void stop() {
		System.out.println("Maruti stops when breaks are applied..");
	}
}
