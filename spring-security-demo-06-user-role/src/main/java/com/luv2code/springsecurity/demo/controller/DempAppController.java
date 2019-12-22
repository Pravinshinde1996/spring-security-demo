package com.luv2code.springsecurity.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DempAppController {

	@RequestMapping("/")
	public String getHomePage() {
		System.out.println("Enter in Homepage...!");
		return "home";
	}
	
	@RequestMapping("/managerHomePage")
	public String getManagerHomePage() {
		System.out.println("Enter in ManagerHomePage...!");
		return "manager-home-page";
	}
	
	@RequestMapping("/seniorManagerHomePage")
	public String getseniorManagerHomePage() {
		System.out.println("Enter in SeniorManagerHomePage...!");
		return "senior-manager-home-page";
	}
}
