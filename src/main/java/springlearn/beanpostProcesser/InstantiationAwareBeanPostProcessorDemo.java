package springlearn.beanpostProcesser;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import springlearn.bean.Student;

//@Component
//@PropertySource("classpath:application.properties")
public class InstantiationAwareBeanPostProcessorDemo implements InstantiationAwareBeanPostProcessor {

    @Autowired
    private Environment environment;

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {

        if (bean instanceof Student) {
            if ("zhangsan".equals(environment.getProperty("enjoy.name"))) {
                return false;
            }
        }
        return true;
    }
}
