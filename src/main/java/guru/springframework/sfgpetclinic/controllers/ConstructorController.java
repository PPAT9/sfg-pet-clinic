package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.services.GreetingService;

public class ConstructorController {

    private final GreetingService greetingService;

    public ConstructorController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
