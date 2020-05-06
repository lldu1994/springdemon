package springlearn.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class UserImpl {

    @Autowired
    private AccountImpl account;
}
