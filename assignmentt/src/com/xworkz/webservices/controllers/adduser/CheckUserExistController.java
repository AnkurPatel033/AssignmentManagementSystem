package com.xworkz.webservices.controllers.adduser;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xworkz.assignment.enumutils.EnumUtils;
import com.xworkz.assignment.exceptions.ControllerException;
import com.xworkz.webservices.services.adduser.CheckUserExistService;

@RestController
public class CheckUserExistController{

	@Autowired
	private CheckUserExistService service;

	public CheckUserExistController() {
		System.out.println("Rest Controller Created:" + this.getClass().getSimpleName());
	}


   
	@RequestMapping(value="/email/{email}",method=RequestMethod.GET)
	public String checkUserExist(@PathVariable String email,Model model) throws ControllerException, Exception {
		System.out.println("Calling signUpDetailsRestController() from RestController...");
		System.out.println("Email:" + email);
		try {
			int i=service.checkUserExist(email);
			
			System.out.println("Match Found..."+i);
			model.addAttribute("message", "User already Exist...");
			return EnumUtils.SignUp.toString();
			
		} catch (Exception e) {
			System.out.println("from Controller Error:" + e.getMessage());
			model.addAttribute("message", "User Checking Fail...");
			return EnumUtils.SignUp.toString();
		}
	}
}
