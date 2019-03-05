package org.vnx.springdi.controllers;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.vnx.springdi.services.*;

@Controller
public class PrimaryGreetingController implements GreetingController {

	private GreetingService greetingService;

	@Autowired
	public PrimaryGreetingController(GreetingService greetingService) {

		this.greetingService = greetingService;
	}

	@Override
	public String greet() {

		return greetingService.greetCasual();
	}
}
