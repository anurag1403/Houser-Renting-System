package training.day2;

public abstract class TwoWheeler extends Vehicle {
	public void selfStart(boolean flag) {
		System.out.println(flag?"Two wheeler has self start" : "Two wheeler has no self start");
	}
	public void hasNoofGear(int noOfGear) {
		System.out.println("This two wheeler has " + noOfGear + " gears");
	}
	
}
