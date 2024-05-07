package mg.itu.demospring.controller;

import mg.itu.demospring.entity.CustomerDemographics;
import mg.itu.demospring.service.CustomerDemographicsService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerDemographicsRestController {
    private final CustomerDemographicsService customerDemographicsService;

    public CustomerDemographicsRestController(CustomerDemographicsService customerDemographicsService) {
        this.customerDemographicsService = customerDemographicsService;
    }

    @PostMapping("/customerDemographicss")
    public void save(@RequestBody CustomerDemographics customerDemographics) {
        customerDemographicsService.save(customerDemographics);
    }

    @GetMapping("/customerDemographicss")
    public CustomerDemographics[] readAll() {
        return customerDemographicsService.readAll();
    }

    @GetMapping("/customerDemographicss/{id}")
    public CustomerDemographics read(@PathVariable String id) {
        return customerDemographicsService.read(id);
    }

    @PutMapping("/customerDemographicss/{id}")
    public void update(@RequestBody CustomerDemographics customerDemographics,
                         @PathVariable String id) {
        customerDemographicsService.update(customerDemographics, id);
    }

    @DeleteMapping("/customerDemographicss/{id}")
    public void delete(@PathVariable String id) {
        customerDemographicsService.delete(id);
    }
}