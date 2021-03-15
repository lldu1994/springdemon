package springlearn.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Son {


    @Autowired
    public Son( Student student){
        System.out.println(student);
    }

    private String userName;
    private String age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
