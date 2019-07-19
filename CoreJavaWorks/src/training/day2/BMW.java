package training.day2;

public class BMW extends FourWheeler{
	
	private String player;

	public BMW(int noOfDoors, FuelType fuelType, String player) {
		super(noOfDoors, fuelType);
		this.player = player;
	}
		
	public void musicPlayer() {
		System.out.println("BMW comes with" + player + " player");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("BMW moves with auto gear");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("BMW stop, with ABS");
	}
}
