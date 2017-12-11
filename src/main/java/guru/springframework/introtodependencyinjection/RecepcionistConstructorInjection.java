package guru.springframework.introtodependencyinjection;

import guru.springframework.introtodependencyinjection.Services.Greet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecepcionistConstructorInjection {
    private Greet greet;

    @Autowired
    public RecepcionistConstructorInjection(Greet greet) {
        this.greet = greet;
    }
    public String sayHello(){
        return greet.hello()+" from the Recepcionist Constructor Injection";
    }
}
