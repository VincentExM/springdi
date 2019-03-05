package org.vnx.springdi.controllers;

import org.springframework.stereotype.*;
import org.vnx.springdi.services.*;

@Controller
public class NonInjectedController implements GreetingController{

	public String greet() {

		GreetingService greetingService = new NonInjectedGreetingService();

		return greetingService.greetCasual();
	}

}
