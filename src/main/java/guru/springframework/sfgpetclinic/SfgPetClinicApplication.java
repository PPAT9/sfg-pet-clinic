package guru.springframework.sfgpetclinic;

import guru.springframework.sfgpetclinic.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgPetClinicApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgPetClinicApplication.class, args);
		MyController mycontroller = (MyController) ctx.getBean("myController");
		String greeting = mycontroller.sayHello();
		System.out.println(greeting);

	}

}
