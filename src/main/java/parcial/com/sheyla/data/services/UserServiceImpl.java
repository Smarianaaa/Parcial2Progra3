package examen.com.Christopher.data.services;

import examen.com.Christopher.dao.UserDao;
import examen.com.Christopher.modelos.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return (List<User>) userDao.findAll();
    }

    @Override
    public User findById(Long id) {
        return userDao.findById(id).orElse(null);
    }

    @Override
    public void createUser(User user) {
        userDao.save(user);
    }

    @Override
    public void updateUser(Long id, User user) {
        if (userDao.existsById(id)) {
            user.setId(id);
            userDao.save(user);
        }
    }

    @Override
    public void deleteUser(Long id) {
        if (userDao.existsById(id)) {
            userDao.deleteById(id);
        }
    }
}
