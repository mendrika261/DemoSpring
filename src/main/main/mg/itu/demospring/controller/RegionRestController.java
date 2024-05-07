package mg.itu.demospring.controller;

import mg.itu.demospring.entity.Region;
import mg.itu.demospring.service.RegionService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RegionRestController {
    private final RegionService regionService;

    public RegionRestController(RegionService regionService) {
        this.regionService = regionService;
    }

    @PostMapping("/regions")
    public void save(@RequestBody Region region) {
        regionService.save(region);
    }

    @GetMapping("/regions")
    public Region[] readAll() {
        return regionService.readAll();
    }

    @GetMapping("/regions/{id}")
    public Region read(@PathVariable Integer id) {
        return regionService.read(id);
    }

    @PutMapping("/regions/{id}")
    public void update(@RequestBody Region region,
                         @PathVariable Integer id) {
        regionService.update(region, id);
    }

    @DeleteMapping("/regions/{id}")
    public void delete(@PathVariable Integer id) {
        regionService.delete(id);
    }
}