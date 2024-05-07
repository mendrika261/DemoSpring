package mg.itu.demospring.service;

import mg.itu.demospring.entity.OrderDetails;
import mg.itu.demospring.repository.OrderDetailsRepository;
import org.springframework.stereotype.Service;


@Service
public class OrderDetailsService {
    private final OrderDetailsRepository orderDetailsRepository;

    public OrderDetailsService(OrderDetailsRepository orderDetailsRepository) {
        this.orderDetailsRepository = orderDetailsRepository;
    }

    public void save(OrderDetails orderDetails) {
        orderDetailsRepository.save(orderDetails);
    }

    public OrderDetails[] readAll() {
        return orderDetailsRepository.findAll().toArray(OrderDetails[]::new);
    }

    public OrderDetails read(Integer id) {
        return orderDetailsRepository.findById(id).orElse(null);
    }

    public void update(OrderDetails orderDetails, Integer id) {
        orderDetailsRepository.save(orderDetails);
    }

    public void delete(Integer id) {
        orderDetailsRepository.deleteById(id);
    }
}