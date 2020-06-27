package springlearn.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@ComponentScan(basePackages = "springlearn.*")
public class ComponentScanBean {
}
