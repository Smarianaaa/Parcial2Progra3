package examen.com.Christopher.data.services;

import examen.com.Christopher.dao.MovementDao;
import examen.com.Christopher.modelos.Movement;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MovementServiceImpl implements MovementService {

    @Autowired
    private MovementDao movementDao;

    @Override
    public List<Movement> findAll() {
        return (List<Movement>) movementDao.findAll();
    }

    @Override
    public List<Movement> findByUserId(Long id) {
        return (List<Movement>) movementDao.findByUserId(id);
    }

    @Override
    public Movement findById(Long id) {
        return movementDao.findById(id).orElse(null);
    }

    @Override
    public void createMovement(Movement movement) {
        movementDao.save(movement);
    }

    @Override
    public void updateMovement(Long id, Movement movement) {
        if (movementDao.existsById(id)) {
            movement.setId(id);
            movementDao.save(movement);
        }
    }

    @Override
    public void deleteMovement(Long id) {
        if (movementDao.existsById(id)) {
            movementDao.deleteById(id);
        }
    }
}
