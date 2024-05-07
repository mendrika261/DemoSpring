package mg.itu.demospring.service;

import mg.itu.demospring.entity.Categories;
import mg.itu.demospring.repository.CategoriesRepository;
import org.springframework.stereotype.Service;


@Service
public class CategoriesService {
    private final CategoriesRepository categoriesRepository;

    public CategoriesService(CategoriesRepository categoriesRepository) {
        this.categoriesRepository = categoriesRepository;
    }

    public void save(Categories categories) {
        categoriesRepository.save(categories);
    }

    public Categories[] readAll() {
        return categoriesRepository.findAll().toArray(Categories[]::new);
    }

    public Categories read(Integer id) {
        return categoriesRepository.findById(id).orElse(null);
    }

    public void update(Categories categories, Integer id) {
        categoriesRepository.save(categories);
    }

    public void delete(Integer id) {
        categoriesRepository.deleteById(id);
    }
}