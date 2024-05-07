package mg.itu.demospring.controller;

import mg.itu.demospring.entity.Shippers;
import mg.itu.demospring.service.ShippersService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ShippersRestController {
    private final ShippersService shippersService;

    public ShippersRestController(ShippersService shippersService) {
        this.shippersService = shippersService;
    }

    @PostMapping("/shipperss")
    public void save(@RequestBody Shippers shippers) {
        shippersService.save(shippers);
    }

    @GetMapping("/shipperss")
    public Shippers[] readAll() {
        return shippersService.readAll();
    }

    @GetMapping("/shipperss/{id}")
    public Shippers read(@PathVariable Integer id) {
        return shippersService.read(id);
    }

    @PutMapping("/shipperss/{id}")
    public void update(@RequestBody Shippers shippers,
                         @PathVariable Integer id) {
        shippersService.update(shippers, id);
    }

    @DeleteMapping("/shipperss/{id}")
    public void delete(@PathVariable Integer id) {
        shippersService.delete(id);
    }
}