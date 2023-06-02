package nemanja.springframework.di.repository;

public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {
    @Override
    public String getGreeting() {
        return "Hello world - english (from repository)";
    }
}
