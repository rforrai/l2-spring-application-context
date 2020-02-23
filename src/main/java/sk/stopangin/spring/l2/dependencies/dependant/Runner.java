package sk.stopangin.spring.l2.dependencies.dependant;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Runner {

    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(Runner.class);
    }
}