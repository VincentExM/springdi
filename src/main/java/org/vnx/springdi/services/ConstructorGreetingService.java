package org.vnx.springdi.services;

import org.springframework.stereotype.*;
import org.vnx.springdi.constants.*;

@Service(ConstructorGreetingService.SERVICE_NAME)
public class ConstructorGreetingService implements GreetingService {

	public static final String SERVICE_NAME = "ConstructorGreetingService";

	@Override
	public String greetCasual() {

		System.out.println(GreetingConstants.CASUAL_GREETING + ConstructorGreetingService.class.getSimpleName());

		return GreetingConstants.CASUAL_GREETING;
	}
}
