package training.sapient.spring01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("SpringContext.xml");
		IHelloService helloService = (IHelloService) context.getBean("hello");
		System.out.println(helloService.sayHello());
	}
}
