package mg.itu.demospring.service;

import mg.itu.demospring.entity.Customers;
import mg.itu.demospring.repository.CustomersRepository;
import org.springframework.stereotype.Service;


@Service
public class CustomersService {
    private final CustomersRepository customersRepository;

    public CustomersService(CustomersRepository customersRepository) {
        this.customersRepository = customersRepository;
    }

    public void save(Customers customers) {
        customersRepository.save(customers);
    }

    public Customers[] readAll() {
        return customersRepository.findAll().toArray(Customers[]::new);
    }

    public Customers read(String id) {
        return customersRepository.findById(id).orElse(null);
    }

    public void update(Customers customers, String id) {
        customersRepository.save(customers);
    }

    public void delete(String id) {
        customersRepository.deleteById(id);
    }
}