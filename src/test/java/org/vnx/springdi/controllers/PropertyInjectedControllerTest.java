package org.vnx.springdi.controllers;

import org.junit.*;
import org.vnx.springdi.constants.*;
import org.vnx.springdi.services.*;

import static org.junit.Assert.*;

public class PropertyInjectedControllerTest {

	private GreetingController propertyInjectedController;

	@Before
	public void setUp() throws Exception {

		PropertyInjectedController propertyInjectedController = new PropertyInjectedController();
		propertyInjectedController.greetingService = new ConstructorGreetingService();

		this.propertyInjectedController = propertyInjectedController;
	}

	@Test
	public void test_greet_should_return_greet() {

		assertEquals(GreetingConstants.CASUAL_GREETING, propertyInjectedController.greet());

	}

}