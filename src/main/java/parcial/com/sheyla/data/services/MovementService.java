package examen.com.Christopher.data.services;

import examen.com.Christopher.modelos.Movement;

import java.util.List;

public interface MovementService {
    public List<Movement> findAll();
    public List<Movement> findByUserId(Long id);
    public Movement findById(Long id);
    public void createMovement(Movement movement);
    public void updateMovement(Long id, Movement movement);
    public void deleteMovement(Long id);
}
