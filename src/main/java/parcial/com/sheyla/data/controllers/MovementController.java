package examen.com.Christopher.data.controllers;

import examen.com.Christopher.data.services.MovementService;
import examen.com.Christopher.modelos.Movement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movement")
public class MovementController {

    @Autowired
    private MovementService movementService;

    @GetMapping
    public List<Movement> findAll() {
        return movementService.findAll();
    }

    @GetMapping("/{id}")
    public Movement findById(@PathVariable Long id) {
        return movementService.findById(id);
    }

    @PostMapping
    public void saveMovement(@RequestBody Movement movement) {
        movementService.createMovement(movement);
    }

    @PutMapping("/{id}")
    public void modifyMovement(@PathVariable Long id, @RequestBody Movement movement) {
        movementService.updateMovement(id, movement);
    }

    @DeleteMapping("/{id}")
    public void deleteMovement(@PathVariable Long id) {
        movementService.deleteMovement(id);
    }

}
