package mg.itu.demospring.repository;

import mg.itu.demospring.entity.UsStates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsStatesRepository extends JpaRepository<UsStates, Integer> {
}