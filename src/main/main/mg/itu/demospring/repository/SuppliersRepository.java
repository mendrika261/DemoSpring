package mg.itu.demospring.repository;

import mg.itu.demospring.entity.Suppliers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SuppliersRepository extends JpaRepository<Suppliers, Integer> {
}