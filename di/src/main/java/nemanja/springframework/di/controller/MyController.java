package nemanja.springframework.di.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHallo(){
        System.out.println("Hello world!");

        return "Hi folks!";
    }
}
