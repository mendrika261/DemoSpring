package mg.itu.demospring.controller;

import mg.itu.demospring.entity.Suppliers;
import mg.itu.demospring.service.SuppliersService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SuppliersRestController {
    private final SuppliersService suppliersService;

    public SuppliersRestController(SuppliersService suppliersService) {
        this.suppliersService = suppliersService;
    }

    @PostMapping("/supplierss")
    public void save(@RequestBody Suppliers suppliers) {
        suppliersService.save(suppliers);
    }

    @GetMapping("/supplierss")
    public Suppliers[] readAll() {
        return suppliersService.readAll();
    }

    @GetMapping("/supplierss/{id}")
    public Suppliers read(@PathVariable Integer id) {
        return suppliersService.read(id);
    }

    @PutMapping("/supplierss/{id}")
    public void update(@RequestBody Suppliers suppliers,
                         @PathVariable Integer id) {
        suppliersService.update(suppliers, id);
    }

    @DeleteMapping("/supplierss/{id}")
    public void delete(@PathVariable Integer id) {
        suppliersService.delete(id);
    }
}