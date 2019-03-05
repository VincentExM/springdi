package org.vnx.springdi.services;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.*;
import org.vnx.springdi.constants.*;

@Service(PrimarioSaludoServicio.SERVICE_NAME)
@Primary
@Profile(ProfileConstants.ESPAGNOL)
public class PrimarioSaludoServicio implements GreetingService {

	public static final String SERVICE_NAME = "PrimarioSaludoServicio";

	@Override
	public String greetCasual() {

		System.out.println(GreetingConstants.CASUAL_GREETING_ES + PrimarioSaludoServicio.class.getSimpleName());

		return GreetingConstants.CASUAL_GREETING_ES;
	}
}
