package springlearn.circular;

import org.springframework.stereotype.Component;

@Component
public class CircularRefConB {

    public CircularRefConB(CircularRefConA circularRefConA) {
        System.out.println("=======circularRefConB=========");
    }
}
