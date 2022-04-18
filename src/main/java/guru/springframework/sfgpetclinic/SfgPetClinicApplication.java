package guru.springframework.sfgpetclinic;

import guru.springframework.sfgpetclinic.controllers.ConstructorController;
import guru.springframework.sfgpetclinic.controllers.MyController;
import guru.springframework.sfgpetclinic.controllers.PropertyInjectedController;
import guru.springframework.sfgpetclinic.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgPetClinicApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgPetClinicApplication.class, args);
		MyController mycontroller = (MyController) ctx.getBean("myController");

		System.out.println("----- Primary  ---");
		System.out.println(mycontroller.sayHello());

		System.out.println("----- Property ---");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------ Setter -------");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("----ConstructorController-----");
		ConstructorController constructorController = (ConstructorController) ctx.getBean("constructorController");
		System.out.println(constructorController.getGreeting());


	}

}
