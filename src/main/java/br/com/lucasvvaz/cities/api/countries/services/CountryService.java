package br.com.lucasvvaz.cities.api.countries.services;

import br.com.lucasvvaz.cities.api.countries.entities.Country;
import br.com.lucasvvaz.cities.api.countries.repository.CountryRepositoryJPA;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
public class CountryService {
    private CountryRepositoryJPA repositoryJPA;

    @Transactional
    public List<Country> getAll() {
        return repositoryJPA.findAll();
    }

    @Transactional
    public Country getById(Long id){
        return repositoryJPA.findById(id).get();
    }
}
