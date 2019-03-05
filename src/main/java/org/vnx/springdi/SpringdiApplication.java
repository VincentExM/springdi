package org.vnx.springdi;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.*;
import org.vnx.springdi.controllers.*;

@SpringBootApplication
public class SpringdiApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringdiApplication.class, args);

		NonInjectedController controller = (NonInjectedController) context.getBean("nonInjectedController");

		controller.greet();

		context.getBean(ConstructorInjectedController.class).greet();
		context.getBean(SetterInjectedController.class).greet();
		context.getBean(PropertyInjectedController.class).greet();
		context.getBean(PrimaryGreetingController.class)
			   .greet();
	}

}
