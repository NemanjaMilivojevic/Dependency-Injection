package nemanja.springframework.di.config;

import nemanja.springframework.di.service.ConstructorInjectedGreetingService;
import nemanja.springframework.di.service.PropertyInjectedGreetingService;
import nemanja.springframework.di.service.SetterInjectedGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingServiceConfig {

    @Bean
    ConstructorInjectedGreetingService constructorInjectedGreetingService(){

        return new ConstructorInjectedGreetingService();
    }
    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService(){
        return new PropertyInjectedGreetingService();
    }
    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService(){
        return new SetterInjectedGreetingService();
    }
}
