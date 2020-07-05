package springlearn.service;

import org.springframework.stereotype.Service;
import springlearn.annotation.ReturnValue;
import springlearn.annotation.TargetMethod;
import springlearn.annotation.ThrowsAnno;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {
    @Override
    public void queryUser(String userId) {

    }

    @Override
    public void addUser(String userId) {

    }

    @Override
    @TargetMethod(name = "李四")
    public void targetUser(String userId) {

    }

    @Override
    @ReturnValue(value = "returnUser")
    public String returnUser(String userId) {

        return "returnUser";
    }


    @Override
    @ThrowsAnno(name = "returnUser")
    public void ThrowsAnno(String userId) {

        throw new RuntimeException("空指针异常");
    }
}
