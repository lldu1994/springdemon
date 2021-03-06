package springlearn.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import springlearn.bean.OriginClass;
import springlearn.bean.ShowSexClass;
import springlearn.bean.Student;

import java.io.IOException;
import java.util.ArrayList;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class SpringTest {

    @Autowired
    private ShowSexClass showSexClass;

    @Autowired
    OriginClass originClass;

    @Test
    public void startSpring() throws IOException {
        ClassPathXmlApplicationContext cpx= new ClassPathXmlApplicationContext("spring.xml");
        Student student = (Student)cpx.getBean("student");
        System.out.println(student.getUsername());
        cpx.close();

       /* ApplicationContext applicationContext = new AnnotationConfigApplicationContext("springlearn.bean");
        Student student = (Student) applicationContext.getBean("student");
        System.out.println(student.getUsername());*/

    }

    @Test
    public void showSex(){
        showSexClass.showSex();
    }

    @Test
    public void replaceMethod(){
        originClass.method("aaa");
        originClass.method(new ArrayList());
    }
}
