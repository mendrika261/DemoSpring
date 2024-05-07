package mg.itu.demospring.repository;

import mg.itu.demospring.entity.EmployeeTerritories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeTerritoriesRepository extends JpaRepository<EmployeeTerritories, Integer> {
}