package mg.itu.demospring.service;

import mg.itu.demospring.entity.Products;
import mg.itu.demospring.repository.ProductsRepository;
import org.springframework.stereotype.Service;


@Service
public class ProductsService {
    private final ProductsRepository productsRepository;

    public ProductsService(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    public void save(Products products) {
        productsRepository.save(products);
    }

    public Products[] readAll() {
        return productsRepository.findAll().toArray(Products[]::new);
    }

    public Products read(Integer id) {
        return productsRepository.findById(id).orElse(null);
    }

    public void update(Products products, Integer id) {
        productsRepository.save(products);
    }

    public void delete(Integer id) {
        productsRepository.deleteById(id);
    }
}