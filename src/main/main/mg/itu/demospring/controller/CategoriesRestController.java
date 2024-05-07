package mg.itu.demospring.controller;

import mg.itu.demospring.entity.Categories;
import mg.itu.demospring.service.CategoriesService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CategoriesRestController {
    private final CategoriesService categoriesService;

    public CategoriesRestController(CategoriesService categoriesService) {
        this.categoriesService = categoriesService;
    }

    @PostMapping("/categoriess")
    public void save(@RequestBody Categories categories) {
        categoriesService.save(categories);
    }

    @GetMapping("/categoriess")
    public Categories[] readAll() {
        return categoriesService.readAll();
    }

    @GetMapping("/categoriess/{id}")
    public Categories read(@PathVariable Integer id) {
        return categoriesService.read(id);
    }

    @PutMapping("/categoriess/{id}")
    public void update(@RequestBody Categories categories,
                         @PathVariable Integer id) {
        categoriesService.update(categories, id);
    }

    @DeleteMapping("/categoriess/{id}")
    public void delete(@PathVariable Integer id) {
        categoriesService.delete(id);
    }
}