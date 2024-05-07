package mg.itu.demospring.controller;

import mg.itu.demospring.entity.Orders;
import mg.itu.demospring.service.OrdersService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OrdersRestController {
    private final OrdersService ordersService;

    public OrdersRestController(OrdersService ordersService) {
        this.ordersService = ordersService;
    }

    @PostMapping("/orderss")
    public void save(@RequestBody Orders orders) {
        ordersService.save(orders);
    }

    @GetMapping("/orderss")
    public Orders[] readAll() {
        return ordersService.readAll();
    }

    @GetMapping("/orderss/{id}")
    public Orders read(@PathVariable Integer id) {
        return ordersService.read(id);
    }

    @PutMapping("/orderss/{id}")
    public void update(@RequestBody Orders orders,
                         @PathVariable Integer id) {
        ordersService.update(orders, id);
    }

    @DeleteMapping("/orderss/{id}")
    public void delete(@PathVariable Integer id) {
        ordersService.delete(id);
    }
}