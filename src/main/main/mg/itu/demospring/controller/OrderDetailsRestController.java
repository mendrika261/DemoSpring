package mg.itu.demospring.controller;

import mg.itu.demospring.entity.OrderDetails;
import mg.itu.demospring.service.OrderDetailsService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OrderDetailsRestController {
    private final OrderDetailsService orderDetailsService;

    public OrderDetailsRestController(OrderDetailsService orderDetailsService) {
        this.orderDetailsService = orderDetailsService;
    }

    @PostMapping("/orderDetailss")
    public void save(@RequestBody OrderDetails orderDetails) {
        orderDetailsService.save(orderDetails);
    }

    @GetMapping("/orderDetailss")
    public OrderDetails[] readAll() {
        return orderDetailsService.readAll();
    }

    @GetMapping("/orderDetailss/{id}")
    public OrderDetails read(@PathVariable Integer id) {
        return orderDetailsService.read(id);
    }

    @PutMapping("/orderDetailss/{id}")
    public void update(@RequestBody OrderDetails orderDetails,
                         @PathVariable Integer id) {
        orderDetailsService.update(orderDetails, id);
    }

    @DeleteMapping("/orderDetailss/{id}")
    public void delete(@PathVariable Integer id) {
        orderDetailsService.delete(id);
    }
}