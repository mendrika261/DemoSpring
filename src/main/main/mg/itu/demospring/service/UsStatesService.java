package mg.itu.demospring.service;

import mg.itu.demospring.entity.UsStates;
import mg.itu.demospring.repository.UsStatesRepository;
import org.springframework.stereotype.Service;


@Service
public class UsStatesService {
    private final UsStatesRepository usStatesRepository;

    public UsStatesService(UsStatesRepository usStatesRepository) {
        this.usStatesRepository = usStatesRepository;
    }

    public void save(UsStates usStates) {
        usStatesRepository.save(usStates);
    }

    public UsStates[] readAll() {
        return usStatesRepository.findAll().toArray(UsStates[]::new);
    }

    public UsStates read(Integer id) {
        return usStatesRepository.findById(id).orElse(null);
    }

    public void update(UsStates usStates, Integer id) {
        usStatesRepository.save(usStates);
    }

    public void delete(Integer id) {
        usStatesRepository.deleteById(id);
    }
}