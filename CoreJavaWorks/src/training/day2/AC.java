package training.day2;

public class AC extends Device implements RemoteControl{

	@Override
	public void on() {
		System.out.println("AC is on");
		
	}

	@Override
	public void off() {
		System.out.println("AC is off");
		
	}
	
}
