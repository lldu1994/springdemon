package springlearn.beanpostProcesser;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

//@Component
public class InstantiationAwareBeanPostProcessorDemo implements InstantiationAwareBeanPostProcessor {

    @Nullable
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {

        //为false 所有的依赖注入失效
        return false;
    }
}
