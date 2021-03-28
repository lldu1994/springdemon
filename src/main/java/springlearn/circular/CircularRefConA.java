package springlearn.circular;

import org.springframework.stereotype.Component;

@Component
public class CircularRefConA {

    //会触发入参对象的getBean
    public CircularRefConA(CircularRefConB circularRefConB) {
        System.out.println("=======circularRefConB=========");
    }
}
