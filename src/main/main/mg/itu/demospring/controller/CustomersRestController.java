package mg.itu.demospring.controller;

import mg.itu.demospring.entity.Customers;
import mg.itu.demospring.service.CustomersService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomersRestController {
    private final CustomersService customersService;

    public CustomersRestController(CustomersService customersService) {
        this.customersService = customersService;
    }

    @PostMapping("/customerss")
    public void save(@RequestBody Customers customers) {
        customersService.save(customers);
    }

    @GetMapping("/customerss")
    public Customers[] readAll() {
        return customersService.readAll();
    }

    @GetMapping("/customerss/{id}")
    public Customers read(@PathVariable String id) {
        return customersService.read(id);
    }

    @PutMapping("/customerss/{id}")
    public void update(@RequestBody Customers customers,
                         @PathVariable String id) {
        customersService.update(customers, id);
    }

    @DeleteMapping("/customerss/{id}")
    public void delete(@PathVariable String id) {
        customersService.delete(id);
    }
}