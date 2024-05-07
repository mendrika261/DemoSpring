package mg.itu.demospring.service;

import mg.itu.demospring.entity.Orders;
import mg.itu.demospring.repository.OrdersRepository;
import org.springframework.stereotype.Service;


@Service
public class OrdersService {
    private final OrdersRepository ordersRepository;

    public OrdersService(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    public void save(Orders orders) {
        ordersRepository.save(orders);
    }

    public Orders[] readAll() {
        return ordersRepository.findAll().toArray(Orders[]::new);
    }

    public Orders read(Integer id) {
        return ordersRepository.findById(id).orElse(null);
    }

    public void update(Orders orders, Integer id) {
        ordersRepository.save(orders);
    }

    public void delete(Integer id) {
        ordersRepository.deleteById(id);
    }
}