package training.sapient.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import training.sapient.bean.Customer;

@Controller
public class CustomerController {
	@RequestMapping(value = "/customerForm" ,method = RequestMethod.GET)
	public String showCustomerForm(Model model) {
		model.addAttribute("customer", new Customer());
		return "custForm";
	}
	@RequestMapping(value = "/save.do")
	public ModelAndView saveCustomerAction(@Valid Customer customer,BindingResult bindingResult,Model model) {
		if (bindingResult.hasErrors()) {
			return new ModelAndView("custForm"); 
			
		}
		//model.addAttribute("customer", customer);
		return new  ModelAndView("cust-save-success", "customer", customer);
	}
}
