package nemanja.springframework.di.service;

import nemanja.springframework.di.repository.EnglishGreetingRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
//@Profile({"EN"})
//@Service("I18nService")
public class I18nEnglishGreetingService implements GreetingService{
    private final EnglishGreetingRepository englishGreetingRepository;

    public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayGreeting() {
//        return "Hello world - english";
        return englishGreetingRepository.getGreeting();
    }
}
