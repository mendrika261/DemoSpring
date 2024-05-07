package mg.itu.demospring.repository;

import mg.itu.demospring.entity.CustomerCustomerDemo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerCustomerDemoRepository extends JpaRepository<CustomerCustomerDemo, String> {
}