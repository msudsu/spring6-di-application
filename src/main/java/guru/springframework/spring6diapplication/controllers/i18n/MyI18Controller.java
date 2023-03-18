package guru.springframework.spring6diapplication.controllers.i18n;

import guru.springframework.spring6diapplication.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyI18Controller {
    private final GreetingService greetingService;

    public MyI18Controller(@Qualifier("i18Service") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
