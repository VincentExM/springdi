package org.vnx.springdi.controllers;

import org.junit.*;
import org.vnx.springdi.constants.*;
import org.vnx.springdi.services.*;

import static org.junit.Assert.*;

public class SetterInjectedControllerTest {

	private GreetingController setterInjectedController;

	@Before
	public void setUp() {

		SetterInjectedController setterInjectedController = new SetterInjectedController();
		setterInjectedController.setSetterGreetingService(new ConstructorGreetingService());

		this.setterInjectedController = setterInjectedController;
	}

	@Test
	public void test_greet_should_return_greet() {

		assertEquals(GreetingConstants.CASUAL_GREETING_EN, setterInjectedController.greet());

	}
}