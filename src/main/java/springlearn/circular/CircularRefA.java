package springlearn.circular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CircularRefA {

    public CircularRefA() {
        System.out.println("==============CircularRefA======");
    }

    //这里会触发CircularRefB类型的getBean操作
    @Autowired
    private CircularRefB circularRefB;
}
