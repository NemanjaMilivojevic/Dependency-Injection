package nemanja.springframework.di.controller;

import nemanja.springframework.di.service.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHalloFromPrimaryBean(){
        return greetingService.sayGreeting();
    }


    public String sayHallo(){
        System.out.println("Hello world!");

        return "Hi folks!";
    }
}
