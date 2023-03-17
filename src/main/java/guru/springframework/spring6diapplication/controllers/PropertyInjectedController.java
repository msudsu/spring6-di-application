package guru.springframework.spring6diapplication.controllers;

import guru.springframework.spring6diapplication.services.GreetingService;

public class PropertyInjectedController {
    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
