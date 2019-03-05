package org.vnx.springdi.controllers;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.vnx.springdi.services.*;

@Controller
public class PropertyInjectedController implements GreetingController{

	@Autowired
	@Qualifier("propertyGreetingService")
	public GreetingService greetingService;

	@Override
	public String greet() {

		return greetingService.greetCasual();
	}
}
