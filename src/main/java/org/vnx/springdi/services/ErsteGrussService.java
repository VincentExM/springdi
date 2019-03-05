package org.vnx.springdi.services;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.*;
import org.vnx.springdi.constants.*;

@Service(ErsteGrussService.SERVICE_NAME)
@Primary
@Profile(ProfileConstants.DEUTSCH)
public class ErsteGrussService implements GreetingService {

	public static final String SERVICE_NAME = "ErsteGrussService";

	@Override
	public String greetCasual() {

		System.out.println(GreetingConstants.CASUAL_GREETING_DE + ErsteGrussService.class.getSimpleName());

		return GreetingConstants.CASUAL_GREETING_DE;
	}
}
