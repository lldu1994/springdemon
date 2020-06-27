package springlearn.service;

import org.springframework.stereotype.Service;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService  {
    @Override
    public String queryUser(String userId) {

        return "xxx";
    }
}
