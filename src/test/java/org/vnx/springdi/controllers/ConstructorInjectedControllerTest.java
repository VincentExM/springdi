package org.vnx.springdi.controllers;

import org.junit.*;
import org.vnx.springdi.services.*;

import static org.junit.Assert.*;

public class ConstructorInjectedControllerTest {

	private GreetingController constructorInjectedController;

	@Before
	public void setUp() throws Exception {

		ConstructorInjectedController constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());

		this.constructorInjectedController = constructorInjectedController;
	}

	@Test
	public void test_greet_should_return_greet() {

		assertEquals(GreetingServiceImpl.CASUAL_GREETING, constructorInjectedController.greet());

	}

}