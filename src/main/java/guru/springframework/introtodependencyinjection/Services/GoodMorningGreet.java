package guru.springframework.introtodependencyinjection.Services;

import org.springframework.stereotype.Service;

@Service
public class GoodMorningGreet implements Greet {

    @Override
    public String hello() {
        return "Good Morning";
    }
}
