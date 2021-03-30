package springlearn.circular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CircularRefB {

    public CircularRefB() {
        System.out.println("======CircularRefB=========");
    }

    @Autowired
    private CircularRefA circularRefA;
}
