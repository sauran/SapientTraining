package com.sapient.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sapient.model.Customer;


@Controller
@RequestMapping("/customer")
public class SignUpContrloller {

	@RequestMapping(value = "/signup" ,method = RequestMethod.POST)
	
	public String addCustomer(@Valid Customer customer  ,BindingResult result){
		
		
		
		if(result.hasErrors()){
			
			return "SignUpForm";
		}else{
			
			return "Done";
		}
	}
	@RequestMapping(method = RequestMethod.GET)
	public String displayCustomerForm(ModelMap model) {

		model.addAttribute("customer", new Customer());
		return "SignUpForm";
	

	}
}	


