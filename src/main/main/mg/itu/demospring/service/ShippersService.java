package mg.itu.demospring.service;

import mg.itu.demospring.entity.Shippers;
import mg.itu.demospring.repository.ShippersRepository;
import org.springframework.stereotype.Service;


@Service
public class ShippersService {
    private final ShippersRepository shippersRepository;

    public ShippersService(ShippersRepository shippersRepository) {
        this.shippersRepository = shippersRepository;
    }

    public void save(Shippers shippers) {
        shippersRepository.save(shippers);
    }

    public Shippers[] readAll() {
        return shippersRepository.findAll().toArray(Shippers[]::new);
    }

    public Shippers read(Integer id) {
        return shippersRepository.findById(id).orElse(null);
    }

    public void update(Shippers shippers, Integer id) {
        shippersRepository.save(shippers);
    }

    public void delete(Integer id) {
        shippersRepository.deleteById(id);
    }
}