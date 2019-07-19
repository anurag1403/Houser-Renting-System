package training.day2;

class AccceptCommand {
	public static void checkDevice(RemoteControl device) {
		device.on();
		device.off();
	}
}

public class InterfaceImpl {
	public static void main(String[] args) {
		RemoteControl rc = new AC();
		AccceptCommand.checkDevice(rc);
		rc = new NightLamp();
		AccceptCommand.checkDevice(rc);
	}
}
