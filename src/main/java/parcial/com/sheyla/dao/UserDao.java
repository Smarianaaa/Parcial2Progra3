package examen.com.Christopher.dao;

import examen.com.Christopher.modelos.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, Long> {
}
