package org.vnx.springdi.controllers;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.vnx.springdi.services.*;

@Controller
public class SetterInjectedController  implements GreetingController{

	@Autowired
	public void setGreetingService(GreetingService greetingService) {

		this.greetingService = greetingService;
	}

	private GreetingService greetingService;

	@Override
	public String greet() {

		return greetingService.greetCasual();
	}
}
