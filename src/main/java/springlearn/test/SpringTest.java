package springlearn.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springlearn.bean.Student;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

public class SpringTest {

    @Test
    public void startSpring() throws IOException {
        ClassPathXmlApplicationContext cpx= new ClassPathXmlApplicationContext("spring.xml");
        Student student = (Student)cpx.getBean("student");
        System.out.println(student.getUsername());

       /* ApplicationContext applicationContext = new AnnotationConfigApplicationContext("springlearn.bean");
        Student student = (Student) applicationContext.getBean("student");
        System.out.println(student.getUsername());*/

    }
}
