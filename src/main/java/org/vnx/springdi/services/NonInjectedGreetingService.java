package org.vnx.springdi.services;

import org.springframework.stereotype.*;
import org.vnx.springdi.constants.*;

@Service(NonInjectedGreetingService.SERVICE_NAME)
public class NonInjectedGreetingService implements GreetingService {

	public static final String SERVICE_NAME = "NonInjectedGreetingService";

	@Override
	public String greetCasual() {

		System.out.println(GreetingConstants.CASUAL_GREETING + NonInjectedGreetingService.class.getSimpleName());

		return GreetingConstants.CASUAL_GREETING;
	}
}
