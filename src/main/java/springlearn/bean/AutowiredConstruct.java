package springlearn.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class AutowiredConstruct {

    @Autowired
    public AutowiredConstruct(SC sc,CQ cq) {

        System.out.println(sc);
        System.out.println(cq);
    }
}

