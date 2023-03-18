package guru.springframework.spring6diapplication.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("ES")
@SpringBootTest
class MyI18ControllerTestES {
    @Autowired
    MyI18Controller myI18Controller;

    @Test
    void sayHello() {
        System.out.println(myI18Controller.sayHello());
    }
}