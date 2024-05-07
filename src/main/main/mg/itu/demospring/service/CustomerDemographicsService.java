package mg.itu.demospring.service;

import mg.itu.demospring.entity.CustomerDemographics;
import mg.itu.demospring.repository.CustomerDemographicsRepository;
import org.springframework.stereotype.Service;


@Service
public class CustomerDemographicsService {
    private final CustomerDemographicsRepository customerDemographicsRepository;

    public CustomerDemographicsService(CustomerDemographicsRepository customerDemographicsRepository) {
        this.customerDemographicsRepository = customerDemographicsRepository;
    }

    public void save(CustomerDemographics customerDemographics) {
        customerDemographicsRepository.save(customerDemographics);
    }

    public CustomerDemographics[] readAll() {
        return customerDemographicsRepository.findAll().toArray(CustomerDemographics[]::new);
    }

    public CustomerDemographics read(String id) {
        return customerDemographicsRepository.findById(id).orElse(null);
    }

    public void update(CustomerDemographics customerDemographics, String id) {
        customerDemographicsRepository.save(customerDemographics);
    }

    public void delete(String id) {
        customerDemographicsRepository.deleteById(id);
    }
}