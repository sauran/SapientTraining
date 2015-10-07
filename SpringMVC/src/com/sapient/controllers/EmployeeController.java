package com.sapient.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sapient.model.Employee;

@Controller
public class EmployeeController {
	
	 
		@RequestMapping(value = "/addEmployee", method = RequestMethod.GET)
		public String addEmp(@ModelAttribute("empModel") Employee emp, ModelMap model){
			
			
			model.addAttribute("id", emp.getId());
			model.addAttribute("fullname", emp.getFullName());
			model.addAttribute("age", emp.getAge());
			
			return "result";
		}
		@RequestMapping(value = "/Employee", method = RequestMethod.GET)
			public ModelAndView employeeInfo(){
				return new ModelAndView("Employee", "command", new Employee());
			}

	
	
	
	
	}
