package mg.itu.demospring.controller;

import mg.itu.demospring.entity.CustomerCustomerDemo;
import mg.itu.demospring.service.CustomerCustomerDemoService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerCustomerDemoRestController {
    private final CustomerCustomerDemoService customerCustomerDemoService;

    public CustomerCustomerDemoRestController(CustomerCustomerDemoService customerCustomerDemoService) {
        this.customerCustomerDemoService = customerCustomerDemoService;
    }

    @PostMapping("/customerCustomerDemos")
    public void save(@RequestBody CustomerCustomerDemo customerCustomerDemo) {
        customerCustomerDemoService.save(customerCustomerDemo);
    }

    @GetMapping("/customerCustomerDemos")
    public CustomerCustomerDemo[] readAll() {
        return customerCustomerDemoService.readAll();
    }

    @GetMapping("/customerCustomerDemos/{id}")
    public CustomerCustomerDemo read(@PathVariable String id) {
        return customerCustomerDemoService.read(id);
    }

    @PutMapping("/customerCustomerDemos/{id}")
    public void update(@RequestBody CustomerCustomerDemo customerCustomerDemo,
                         @PathVariable String id) {
        customerCustomerDemoService.update(customerCustomerDemo, id);
    }

    @DeleteMapping("/customerCustomerDemos/{id}")
    public void delete(@PathVariable String id) {
        customerCustomerDemoService.delete(id);
    }
}