package guru.springframework.introtodependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class IntrotodependencyinjectionApplication {

	public static void main(String[] args) {

		ApplicationContext ctx= SpringApplication.run(IntrotodependencyinjectionApplication.class, args);

		System.out.println(ctx.getBean(RecepcionistConstructorInjection.class).sayHello());
		System.out.println(ctx.getBean(RecepcionistSetterInjection.class).sayHello());
	}
}
