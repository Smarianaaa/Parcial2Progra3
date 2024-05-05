package examen.com.Christopher.data.services;

import examen.com.Christopher.dao.ReportDao;
import examen.com.Christopher.dao.UserDao;
import examen.com.Christopher.modelos.Movement;
import examen.com.Christopher.modelos.Report;
import examen.com.Christopher.modelos.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ReportServiceImpl implements ReportService {

    @Autowired
    private ReportDao reportDao;

    @Autowired
    private UserDao userDao;

    @Autowired
    private MovementService movementService;

    @Override
    public Report GetTotalByUserId(Long id) {
        Report report = new Report();
        User user = userDao.findById(id).orElse(null);
        if (user != null) {
            double totalAmount = 0;
            List<Movement> movementsById = movementService.findByUserId(id);
            for(Movement movement : movementsById) {
                totalAmount += movement.getAmount();
            }
            report.setUserId(id);
            report.setUserName(user.getName());
            report.setAmount(totalAmount);
        }
        return report;
    }
}
