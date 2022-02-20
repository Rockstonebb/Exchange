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
        validateUser(user);
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

    private void validateUser(User user) throws UserException {

        // JUST FOR TESTING
        if(user.getUsername().isBlank() || user.getUsername().isEmpty() || user.getUsername() == null ||
                user.getDisplayName().isBlank() || user.getDisplayName().isEmpty() || user.getDisplayName() == null ||
                user.getDisplaySurname().isBlank() || user.getDisplaySurname().isEmpty() || user.getDisplaySurname() == null ||
                user.getEmail().isBlank() || user.getEmail().isEmpty() || user.getEmail() == null ){
            throw new UserException("All fields must be filled");
        }
    }
}
