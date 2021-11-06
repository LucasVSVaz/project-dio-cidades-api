package br.com.lucasvvaz.cities.api.states.controllers;

import br.com.lucasvvaz.cities.api.states.entities.State;
import br.com.lucasvvaz.cities.api.states.services.StateService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/states")
@AllArgsConstructor
public class StateControllers {
    private StateService service;

    @GetMapping
    private List<State> getAllStates() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    private State getOneById(@PathVariable Long id) {
        return service.getById(id);
    }
}
