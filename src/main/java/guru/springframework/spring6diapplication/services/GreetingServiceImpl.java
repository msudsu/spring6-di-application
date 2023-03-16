package guru.springframework.spring6diapplication.services;

import org.springframework.stereotype.Controller;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Everyone From Base Service!";
    }
}
