package mg.itu.demospring.service;

import mg.itu.demospring.entity.Employees;
import mg.itu.demospring.repository.EmployeesRepository;
import org.springframework.stereotype.Service;


@Service
public class EmployeesService {
    private final EmployeesRepository employeesRepository;

    public EmployeesService(EmployeesRepository employeesRepository) {
        this.employeesRepository = employeesRepository;
    }

    public void save(Employees employees) {
        employeesRepository.save(employees);
    }

    public Employees[] readAll() {
        return employeesRepository.findAll().toArray(Employees[]::new);
    }

    public Employees read(Integer id) {
        return employeesRepository.findById(id).orElse(null);
    }

    public void update(Employees employees, Integer id) {
        employeesRepository.save(employees);
    }

    public void delete(Integer id) {
        employeesRepository.deleteById(id);
    }
}