package training.sapient.spring01;

public class HelloService implements IHelloService {

	private String name;
	private String city;
	
	public String sayHello() {
		// TODO Auto-generated method stub
		return this.sayHello(name,city);
	}

	public String sayHello(String name, String city) {
		String myString[] = {
				"Hey Mr/Mrs/Ms: %s, how is your city %s",
				"Good morning %s, heard you're in %s",
				"Mr/Mrs/Ms:%s, your city %s is beautiful"
		};
		int randomNumber = (int) (Math.random() * 3);
		return String.format(myString[randomNumber].toString(),name,city);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	

}
