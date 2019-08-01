package training.sapient.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	//Method 1 to call LoginPage.jsp
	@RequestMapping("/login")
	public String getLoginPage() {
		return "LoginPage";
	}
	//Method 2 to do validation
	@RequestMapping(value = "/loginvalidate", method = RequestMethod.GET)
	public ModelAndView loginValidate(HttpServletRequest request, HttpServletResponse response) {
		String name = request.getParameter("name");
		String password = request.getParameter("pass");
		if(name.equals("sapient") && password.equals("india")) {
			String msg = "hello " + name;
			return new ModelAndView("loginsuccesspage", "message", msg);			
		}
		return new ModelAndView("loginfailurepage", "message", "Sorry Invalid credentials");
	}
	
	
}
