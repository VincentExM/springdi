package org.vnx.springdi.services;

import org.springframework.stereotype.*;
import org.vnx.springdi.constants.*;

@Service
public class PropertyGreetingService implements GreetingService {


	@Override
	public String greetCasual() {

		System.out.println(GreetingConstants.CASUAL_GREETING_EN + PropertyGreetingService.class.getSimpleName());

		return GreetingConstants.CASUAL_GREETING_EN;
	}
}
