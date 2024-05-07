package mg.itu.demospring.controller;

import mg.itu.demospring.entity.EmployeeTerritories;
import mg.itu.demospring.service.EmployeeTerritoriesService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeTerritoriesRestController {
    private final EmployeeTerritoriesService employeeTerritoriesService;

    public EmployeeTerritoriesRestController(EmployeeTerritoriesService employeeTerritoriesService) {
        this.employeeTerritoriesService = employeeTerritoriesService;
    }

    @PostMapping("/employeeTerritoriess")
    public void save(@RequestBody EmployeeTerritories employeeTerritories) {
        employeeTerritoriesService.save(employeeTerritories);
    }

    @GetMapping("/employeeTerritoriess")
    public EmployeeTerritories[] readAll() {
        return employeeTerritoriesService.readAll();
    }

    @GetMapping("/employeeTerritoriess/{id}")
    public EmployeeTerritories read(@PathVariable Integer id) {
        return employeeTerritoriesService.read(id);
    }

    @PutMapping("/employeeTerritoriess/{id}")
    public void update(@RequestBody EmployeeTerritories employeeTerritories,
                         @PathVariable Integer id) {
        employeeTerritoriesService.update(employeeTerritories, id);
    }

    @DeleteMapping("/employeeTerritoriess/{id}")
    public void delete(@PathVariable Integer id) {
        employeeTerritoriesService.delete(id);
    }
}