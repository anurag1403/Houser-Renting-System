package training.sapient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorld {
	@RequestMapping("/")
	public String helloWorld() {
		return "index";
	}
	
	@RequestMapping("/hello")
	public ModelAndView sayHello() {
		return new ModelAndView("hello","MSG", "Welcome to Spring by Naveen");
	}
}
