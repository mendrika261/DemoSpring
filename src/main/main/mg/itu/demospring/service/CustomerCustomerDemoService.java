package mg.itu.demospring.service;

import mg.itu.demospring.entity.CustomerCustomerDemo;
import mg.itu.demospring.repository.CustomerCustomerDemoRepository;
import org.springframework.stereotype.Service;


@Service
public class CustomerCustomerDemoService {
    private final CustomerCustomerDemoRepository customerCustomerDemoRepository;

    public CustomerCustomerDemoService(CustomerCustomerDemoRepository customerCustomerDemoRepository) {
        this.customerCustomerDemoRepository = customerCustomerDemoRepository;
    }

    public void save(CustomerCustomerDemo customerCustomerDemo) {
        customerCustomerDemoRepository.save(customerCustomerDemo);
    }

    public CustomerCustomerDemo[] readAll() {
        return customerCustomerDemoRepository.findAll().toArray(CustomerCustomerDemo[]::new);
    }

    public CustomerCustomerDemo read(String id) {
        return customerCustomerDemoRepository.findById(id).orElse(null);
    }

    public void update(CustomerCustomerDemo customerCustomerDemo, String id) {
        customerCustomerDemoRepository.save(customerCustomerDemo);
    }

    public void delete(String id) {
        customerCustomerDemoRepository.deleteById(id);
    }
}