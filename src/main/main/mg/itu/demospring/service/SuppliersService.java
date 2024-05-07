package mg.itu.demospring.service;

import mg.itu.demospring.entity.Suppliers;
import mg.itu.demospring.repository.SuppliersRepository;
import org.springframework.stereotype.Service;


@Service
public class SuppliersService {
    private final SuppliersRepository suppliersRepository;

    public SuppliersService(SuppliersRepository suppliersRepository) {
        this.suppliersRepository = suppliersRepository;
    }

    public void save(Suppliers suppliers) {
        suppliersRepository.save(suppliers);
    }

    public Suppliers[] readAll() {
        return suppliersRepository.findAll().toArray(Suppliers[]::new);
    }

    public Suppliers read(Integer id) {
        return suppliersRepository.findById(id).orElse(null);
    }

    public void update(Suppliers suppliers, Integer id) {
        suppliersRepository.save(suppliers);
    }

    public void delete(Integer id) {
        suppliersRepository.deleteById(id);
    }
}