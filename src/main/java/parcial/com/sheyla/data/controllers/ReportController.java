package examen.com.Christopher.data.controllers;

import examen.com.Christopher.data.services.ReportService;
import examen.com.Christopher.modelos.Report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/report")
public class ReportController {
    @Autowired
    private ReportService reportService;

    @GetMapping("/{id}")
    public Report getTotalByUserId(@PathVariable Long id) {
        return reportService.GetTotalByUserId(id);
    }
}
