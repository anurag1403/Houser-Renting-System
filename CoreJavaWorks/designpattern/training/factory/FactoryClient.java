package training.factory;

public class FactoryClient {
	public static void main(String[] args) {
		Car car = Car.getMyCar(ICars.FORD);
	}
}
