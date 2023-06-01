package nemanja.springframework.di.service;

import org.springframework.stereotype.Service;

public class ConstructorInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello world - Constructor";
    }
}
