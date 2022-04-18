package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
