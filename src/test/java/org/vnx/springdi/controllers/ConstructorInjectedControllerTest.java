package org.vnx.springdi.controllers;

import org.junit.*;
import org.vnx.springdi.constants.*;
import org.vnx.springdi.services.*;

import static org.junit.Assert.*;

public class ConstructorInjectedControllerTest {

	private GreetingController constructorInjectedController;

	@Before
	public void setUp() {

		ConstructorInjectedController constructorInjectedController = new ConstructorInjectedController(new ConstructorGreetingService());

		this.constructorInjectedController = constructorInjectedController;
	}

	@Test
	public void test_greet_should_return_greet() {

		assertEquals(GreetingConstants.CASUAL_GREETING_EN, constructorInjectedController.greet());

	}

}