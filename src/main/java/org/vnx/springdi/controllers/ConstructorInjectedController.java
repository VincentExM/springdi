package org.vnx.springdi.controllers;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.vnx.springdi.services.*;

@Controller
public class ConstructorInjectedController implements GreetingController{

	private GreetingService greetingService;

	@Autowired
	public ConstructorInjectedController(GreetingService greetingService) {

		this.greetingService = greetingService;
	}

	@Override
	public String greet() {

		return greetingService.greetCasual();
	}
}
