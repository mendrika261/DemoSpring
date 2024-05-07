package mg.itu.demospring.controller;

import mg.itu.demospring.entity.Employees;
import mg.itu.demospring.service.EmployeesService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeesRestController {
    private final EmployeesService employeesService;

    public EmployeesRestController(EmployeesService employeesService) {
        this.employeesService = employeesService;
    }

    @PostMapping("/employeess")
    public void save(@RequestBody Employees employees) {
        employeesService.save(employees);
    }

    @GetMapping("/employeess")
    public Employees[] readAll() {
        return employeesService.readAll();
    }

    @GetMapping("/employeess/{id}")
    public Employees read(@PathVariable Integer id) {
        return employeesService.read(id);
    }

    @PutMapping("/employeess/{id}")
    public void update(@RequestBody Employees employees,
                         @PathVariable Integer id) {
        employeesService.update(employees, id);
    }

    @DeleteMapping("/employeess/{id}")
    public void delete(@PathVariable Integer id) {
        employeesService.delete(id);
    }
}