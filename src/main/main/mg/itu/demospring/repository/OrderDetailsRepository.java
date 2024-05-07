package mg.itu.demospring.repository;

import mg.itu.demospring.entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Integer> {
}