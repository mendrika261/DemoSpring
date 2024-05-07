package mg.itu.demospring.repository;

import mg.itu.demospring.entity.Shippers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ShippersRepository extends JpaRepository<Shippers, Integer> {
}