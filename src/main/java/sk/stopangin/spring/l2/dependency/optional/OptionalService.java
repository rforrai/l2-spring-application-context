package sk.stopangin.spring.l2.dependency.optional;

import org.springframework.stereotype.Service;

@Service
public class OptionalService  implements SomeService {
    @Override
    public void doSomething() {
        System.out.println("hello from optional service");
    }
}
