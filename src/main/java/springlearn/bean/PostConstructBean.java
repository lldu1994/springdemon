package springlearn.bean;

import org.springframework.context.annotation.ComponentScans;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class PostConstructBean {


    @PostConstruct
    public void postConstruct() {
        System.out.println("实例化完成后调用");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("实例销毁之前调用");
    }


}
