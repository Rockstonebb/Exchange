package ar.com.phoenos.exchange.bundle.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserJpaRepository repository;

    @Autowired
    public UserServiceImpl(UserJpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public void createUser(User user) throws Exception {
        if (user != null)
            repository.save(user);
    }

    @Override
    public void deleteUser(Long userId) throws Exception {
        throw new Exception("Not implemented yet");
    }

    @Override
    public void modifyUser(Long userId, User user) throws Exception {
        throw new Exception("Not implemented yet");
    }

    @Override
    public User getUser(Long userId) throws Exception {
        throw new Exception("Not implemented yet");
    }

    @Override
    public User searchUser(Object param) throws Exception {
        throw new Exception("Not implemented yet");
    }
}
