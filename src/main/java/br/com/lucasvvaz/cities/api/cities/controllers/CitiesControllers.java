package br.com.lucasvvaz.cities.api.cities.controllers;

import br.com.lucasvvaz.cities.api.cities.entities.City;
import br.com.lucasvvaz.cities.api.cities.services.CityServiceDB;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cities")
@AllArgsConstructor
public class CitiesControllers {
    private CityServiceDB service;

    @GetMapping
    private List<City> getAllCities() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    private City getOneById(@PathVariable Long id) {
        return service.getById(id);
    }

}
