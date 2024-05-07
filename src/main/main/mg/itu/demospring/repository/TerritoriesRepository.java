package mg.itu.demospring.repository;

import mg.itu.demospring.entity.Territories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TerritoriesRepository extends JpaRepository<Territories, String> {
}