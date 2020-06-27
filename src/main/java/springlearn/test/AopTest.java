package springlearn.test;


import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springlearn.aop.ComponentScanBean;
import springlearn.service.UserService;

public class AopTest {
    @Autowired
    UserService userService;

    private ApplicationContext applicationContext;

    @Before
    public void before() {
        applicationContext = new AnnotationConfigApplicationContext(ComponentScanBean.class);
    }

    @Test
    public void test1() {
        UserService userService = applicationContext.getBean(UserService.class);

        userService.queryUser("lisi");
    }
}
