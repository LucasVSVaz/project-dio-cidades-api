package br.com.lucasvvaz.cities.api.cities.services;

import br.com.lucasvvaz.cities.api.cities.entities.City;
import br.com.lucasvvaz.cities.api.cities.repository.CityRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CityServiceDB {
    private CityRepository repository;

    public List<City> getAll() {
        return repository.findAll();
    }


    public City getById(Long id) {
        return repository.findById(id).get();
    }
}
