package springlearn.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springlearn.aop.ComponentScanBean;
import springlearn.service.area.AreaService;

import java.util.HashMap;
import java.util.Map;

public class TransactionTest {
    private ApplicationContext applicationContext;

    @Before
    public void before() {
        applicationContext = new AnnotationConfigApplicationContext(ComponentScanBean.class);
    }

    @Test
    public void test1() {
        AreaService bean  =(AreaService) applicationContext.getBean("areaServiceImpl");
        Map param = new HashMap();
        param.put("areaCode","HB1");
        bean.queryAreaFromDB(param);
    }
}


