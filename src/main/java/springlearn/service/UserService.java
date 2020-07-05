package springlearn.service;

public interface UserService {
    public void queryUser(String userId);

    public void addUser(String userId);

     public void targetUser(String userId);

    public String returnUser(String userId);

    public void   ThrowsAnno(String userId);

}
