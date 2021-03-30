package springlearn.bean;

import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
import springlearn.aware.AwareBean;

@Component
@Import(AwareBean.class)
public class CQ {
}
