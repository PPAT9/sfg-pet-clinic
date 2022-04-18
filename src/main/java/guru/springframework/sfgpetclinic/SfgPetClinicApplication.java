package guru.springframework.sfgpetclinic;

import guru.springframework.sfgpetclinic.controllers.ConstructorController;
import guru.springframework.sfgpetclinic.controllers.MyController;
import guru.springframework.sfgpetclinic.controllers.PropertyInjectedController;
import guru.springframework.sfgpetclinic.controllers.SetterInjectionController;
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

		System.out.println("----- Property ---");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------ Setter -------");
		SetterInjectionController setterInjectionController = (SetterInjectionController) ctx.getBean("setterInjectionController");
		System.out.println(setterInjectionController.getGreeting());

		System.out.println("----ConstructorController-----");
		ConstructorController constructorController = (ConstructorController) ctx.getBean("constructorController");
		System.out.println(constructorController.getGreeting());


	}

}
