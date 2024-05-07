package mg.itu.demospring.repository;

import mg.itu.demospring.entity.CustomerDemographics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerDemographicsRepository extends JpaRepository<CustomerDemographics, String> {
}