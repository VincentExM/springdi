package org.vnx.springdi.controllers;

import org.springframework.stereotype.*;

@Controller
public class MyController {

	public String hello() {

		String hello = "hello!!! ";

		System.out.println(hello);

		return hello;
	}

}
