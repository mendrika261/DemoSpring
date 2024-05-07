package mg.itu.demospring.service;

import mg.itu.demospring.entity.Region;
import mg.itu.demospring.repository.RegionRepository;
import org.springframework.stereotype.Service;


@Service
public class RegionService {
    private final RegionRepository regionRepository;

    public RegionService(RegionRepository regionRepository) {
        this.regionRepository = regionRepository;
    }

    public void save(Region region) {
        regionRepository.save(region);
    }

    public Region[] readAll() {
        return regionRepository.findAll().toArray(Region[]::new);
    }

    public Region read(Integer id) {
        return regionRepository.findById(id).orElse(null);
    }

    public void update(Region region, Integer id) {
        regionRepository.save(region);
    }

    public void delete(Integer id) {
        regionRepository.deleteById(id);
    }
}