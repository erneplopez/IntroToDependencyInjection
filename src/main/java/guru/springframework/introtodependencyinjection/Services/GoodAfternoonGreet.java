package guru.springframework.introtodependencyinjection.Services;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class GoodAfternoonGreet implements Greet {

    @Override
    public String hello() {
        return "Good Afternoon";
    }
}
