package springlearn.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;


@Component
public class valueBean implements EnvironmentAware {

    @Value("${enjoy.name}")
    private String name;

    @Override
    public void setEnvironment(Environment environment) {
        System.out.println(name);
        System.out.println(environment.getProperty("enjoy.name"));
    }
}
