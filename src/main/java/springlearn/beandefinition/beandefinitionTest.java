package springlearn.beandefinition;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.*;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.util.Properties;

@Component
public class beandefinitionTest implements BeanDefinitionRegistryPostProcessor {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        GenericBeanDefinition genericBeanDefinition = new GenericBeanDefinition();
        genericBeanDefinition.setBeanClass(BeanClass.class);
        MutablePropertyValues propertyValues = genericBeanDefinition.getPropertyValues();
        propertyValues.addPropertyValue("username", "lld1");
        registry.registerBeanDefinition("beanClass", genericBeanDefinition);
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        StandardEnvironment bean = (StandardEnvironment) beanFactory.getBean(Environment.class);
        MutablePropertySources propertySources = new MutablePropertySources();
        Properties properties = new Properties();
        properties.put("enjoy.name", "jack");
        PropertiesPropertySource propertySource = new PropertiesPropertySource("custom", properties);
        propertySources.addLast(propertySource);
        //bean.getPropertySources().addLast(propertySource);
        DefaultListableBeanFactory defaultListableBeanFactory = (DefaultListableBeanFactory)beanFactory;
        //defaultListableBeanFactory.setAllowCircularReferences(false);
    }

}
