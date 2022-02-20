package ar.com.phoenos.exchange.bundle.user;

public interface UserService {

    void createUser(User user) throws Exception;
    void deleteUser(Long userId) throws Exception;
    void modifyUser(Long userId, User user) throws Exception;
    User getUser(Long userId) throws Exception;
    User searchUser(Object param) throws Exception;

}
