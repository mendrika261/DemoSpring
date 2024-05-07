package mg.itu.demospring.service;

import mg.itu.demospring.entity.EmployeeTerritories;
import mg.itu.demospring.repository.EmployeeTerritoriesRepository;
import org.springframework.stereotype.Service;


@Service
public class EmployeeTerritoriesService {
    private final EmployeeTerritoriesRepository employeeTerritoriesRepository;

    public EmployeeTerritoriesService(EmployeeTerritoriesRepository employeeTerritoriesRepository) {
        this.employeeTerritoriesRepository = employeeTerritoriesRepository;
    }

    public void save(EmployeeTerritories employeeTerritories) {
        employeeTerritoriesRepository.save(employeeTerritories);
    }

    public EmployeeTerritories[] readAll() {
        return employeeTerritoriesRepository.findAll().toArray(EmployeeTerritories[]::new);
    }

    public EmployeeTerritories read(Integer id) {
        return employeeTerritoriesRepository.findById(id).orElse(null);
    }

    public void update(EmployeeTerritories employeeTerritories, Integer id) {
        employeeTerritoriesRepository.save(employeeTerritories);
    }

    public void delete(Integer id) {
        employeeTerritoriesRepository.deleteById(id);
    }
}