package mg.itu.demospring.controller;

import mg.itu.demospring.entity.UsStates;
import mg.itu.demospring.service.UsStatesService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UsStatesRestController {
    private final UsStatesService usStatesService;

    public UsStatesRestController(UsStatesService usStatesService) {
        this.usStatesService = usStatesService;
    }

    @PostMapping("/usStatess")
    public void save(@RequestBody UsStates usStates) {
        usStatesService.save(usStates);
    }

    @GetMapping("/usStatess")
    public UsStates[] readAll() {
        return usStatesService.readAll();
    }

    @GetMapping("/usStatess/{id}")
    public UsStates read(@PathVariable Integer id) {
        return usStatesService.read(id);
    }

    @PutMapping("/usStatess/{id}")
    public void update(@RequestBody UsStates usStates,
                         @PathVariable Integer id) {
        usStatesService.update(usStates, id);
    }

    @DeleteMapping("/usStatess/{id}")
    public void delete(@PathVariable Integer id) {
        usStatesService.delete(id);
    }
}