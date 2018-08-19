package com.anony.main.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class pageRedirectionController {

	private static ModelAndView view;
	
	
	@RequestMapping(value="/WelcomePage.htm" ,method = RequestMethod.GET)
	public ModelAndView redirectToLandingPage()
	{
		System.out.println("landingpage controller");
		 view=new ModelAndView("LandingPage");
		view	
			.addObject("WELCOME_MESSAGE", "WELCOME TO LANDING PAGE");
		
		return view;
	}
	
	@RequestMapping(value="/Hello.htm" ,method = RequestMethod.GET)
	public ModelAndView redirectToHelloPage()
	{
		System.out.println("hello page controller");
		 view=new ModelAndView("Hello");
		view	
			.addObject("WELCOME-MESSAGE", "WELCOME TO Hello PAGE");
		
		return view;
	}
	
	
	
}
