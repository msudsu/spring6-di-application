package guru.springframework.spring6diapplication.services.i18n;

import guru.springframework.spring6diapplication.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18Service")
public class SpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola in Spanish";
    }
}
