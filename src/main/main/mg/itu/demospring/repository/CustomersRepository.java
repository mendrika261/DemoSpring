package mg.itu.demospring.repository;

import mg.itu.demospring.entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomersRepository extends JpaRepository<Customers, String> {
}