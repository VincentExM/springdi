package org.vnx.springdi.controllers;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.vnx.springdi.services.*;

@Controller
public class SetterInjectedController  implements GreetingController{

	@Autowired
	public void setSetterGreetingService(GreetingService setterGreetingService) {

		this.setterGreetingService = setterGreetingService;
	}

	private GreetingService setterGreetingService;

	@Override
	public String greet() {

		return setterGreetingService.greetCasual();
	}
}
