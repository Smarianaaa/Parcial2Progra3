package examen.com.Christopher.data.services;

import examen.com.Christopher.modelos.Movement;
import examen.com.Christopher.modelos.User;

import java.util.List;

public interface UserService {
    public List<User> findAll();
    public User findById(Long id);
    public void createUser(User user);
    public void updateUser(Long id, User user);
    public void deleteUser(Long id);
}
