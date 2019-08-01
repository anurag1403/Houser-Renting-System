package training.sapient.spring01;

public interface IHelloService {
	
	//the value for this method will be injected from .xml file
	public String sayHello();
	public String sayHello(String name, String city);
	
	
}
