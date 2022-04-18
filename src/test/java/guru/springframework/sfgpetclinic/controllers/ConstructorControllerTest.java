package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorControllerTest {

    ConstructorController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}