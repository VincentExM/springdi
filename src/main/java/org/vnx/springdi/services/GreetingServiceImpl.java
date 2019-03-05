package org.vnx.springdi.services;

import org.springframework.stereotype.*;

@Component
public class GreetingServiceImpl implements GreetingService {

	public static final String CASUAL_GREETING = "Hello Gurus!";

	@Override
	public String greetCasual() {

		System.out.println(CASUAL_GREETING);

		return CASUAL_GREETING;
	}
}
