package nemanja.springframework.di.controller;

import nemanja.springframework.di.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Autowired
    public GreetingService greetingService;


    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
