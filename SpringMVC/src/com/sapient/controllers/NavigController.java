/**
 * 
 */
package com.sapient.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author span42
 *
 */

@Controller
public class NavigController {
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	
	public String homePage(){
		
		
		return "index";
	}

}
