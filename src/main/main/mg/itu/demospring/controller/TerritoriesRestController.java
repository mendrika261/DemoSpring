package mg.itu.demospring.controller;

import mg.itu.demospring.entity.Territories;
import mg.itu.demospring.service.TerritoriesService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TerritoriesRestController {
    private final TerritoriesService territoriesService;

    public TerritoriesRestController(TerritoriesService territoriesService) {
        this.territoriesService = territoriesService;
    }

    @PostMapping("/territoriess")
    public void save(@RequestBody Territories territories) {
        territoriesService.save(territories);
    }

    @GetMapping("/territoriess")
    public Territories[] readAll() {
        return territoriesService.readAll();
    }

    @GetMapping("/territoriess/{id}")
    public Territories read(@PathVariable String id) {
        return territoriesService.read(id);
    }

    @PutMapping("/territoriess/{id}")
    public void update(@RequestBody Territories territories,
                         @PathVariable String id) {
        territoriesService.update(territories, id);
    }

    @DeleteMapping("/territoriess/{id}")
    public void delete(@PathVariable String id) {
        territoriesService.delete(id);
    }
}