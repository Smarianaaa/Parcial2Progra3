package examen.com.Christopher.dao;

import examen.com.Christopher.modelos.Movement;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MovementDao extends CrudRepository<Movement, Long> {
    List<Movement> findByUserId(Long id);
}
