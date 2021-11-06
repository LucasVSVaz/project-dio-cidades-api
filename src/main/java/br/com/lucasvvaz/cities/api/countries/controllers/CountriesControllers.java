package br.com.lucasvvaz.cities.api.countries.controllers;

import br.com.lucasvvaz.cities.api.countries.entities.Country;
import br.com.lucasvvaz.cities.api.countries.services.CountryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/countries")
@AllArgsConstructor
public class CountriesControllers {
    private CountryService service;

    @GetMapping
    private List<Country> getAllCountries() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    private Country getOneById(@PathVariable Long id) {
        return service.getById(id);
    }
}
