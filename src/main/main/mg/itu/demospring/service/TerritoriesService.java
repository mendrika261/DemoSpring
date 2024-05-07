package mg.itu.demospring.service;

import mg.itu.demospring.entity.Territories;
import mg.itu.demospring.repository.TerritoriesRepository;
import org.springframework.stereotype.Service;


@Service
public class TerritoriesService {
    private final TerritoriesRepository territoriesRepository;

    public TerritoriesService(TerritoriesRepository territoriesRepository) {
        this.territoriesRepository = territoriesRepository;
    }

    public void save(Territories territories) {
        territoriesRepository.save(territories);
    }

    public Territories[] readAll() {
        return territoriesRepository.findAll().toArray(Territories[]::new);
    }

    public Territories read(String id) {
        return territoriesRepository.findById(id).orElse(null);
    }

    public void update(Territories territories, String id) {
        territoriesRepository.save(territories);
    }

    public void delete(String id) {
        territoriesRepository.deleteById(id);
    }
}