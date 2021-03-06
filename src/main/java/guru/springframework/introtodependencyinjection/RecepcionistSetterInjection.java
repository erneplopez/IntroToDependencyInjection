package guru.springframework.introtodependencyinjection;

import guru.springframework.introtodependencyinjection.Services.Greet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecepcionistSetterInjection {
    private Greet greet;

    @Autowired
    public void setGreet(@Qualifier("goodMorningGreet") Greet greet){
        this.greet=greet;
    }
    public String sayHello(){
        return greet.hello()+" from the Recepcionist Setter Injection";
    }
}
