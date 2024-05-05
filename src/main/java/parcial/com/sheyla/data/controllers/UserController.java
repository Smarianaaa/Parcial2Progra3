package examen.com.Christopher.data.controllers;

import examen.com.Christopher.data.services.UserService;
import examen.com.Christopher.modelos.Movement;
import examen.com.Christopher.modelos.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @PostMapping
    public void saveUser(@RequestBody User user) {
        userService.createUser(user);
    }

    @PutMapping("/{id}")
    public void modifyUser(@PathVariable Long id, @RequestBody User user) {
        userService.updateUser(id, user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }

}
