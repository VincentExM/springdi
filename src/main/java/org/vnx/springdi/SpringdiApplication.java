package org.vnx.springdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.*;
import org.vnx.springdi.controllers.*;

@SpringBootApplication
public class SpringdiApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringdiApplication.class, args);

		MyController controller = (MyController) context.getBean("myController");

		controller.hello();
	}

}
