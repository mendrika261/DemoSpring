package mg.itu.demospring.controller;

import mg.itu.demospring.entity.Products;
import mg.itu.demospring.service.ProductsService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductsRestController {
    private final ProductsService productsService;

    public ProductsRestController(ProductsService productsService) {
        this.productsService = productsService;
    }

    @PostMapping("/productss")
    public void save(@RequestBody Products products) {
        productsService.save(products);
    }

    @GetMapping("/productss")
    public Products[] readAll() {
        return productsService.readAll();
    }

    @GetMapping("/productss/{id}")
    public Products read(@PathVariable Integer id) {
        return productsService.read(id);
    }

    @PutMapping("/productss/{id}")
    public void update(@RequestBody Products products,
                         @PathVariable Integer id) {
        productsService.update(products, id);
    }

    @DeleteMapping("/productss/{id}")
    public void delete(@PathVariable Integer id) {
        productsService.delete(id);
    }
}