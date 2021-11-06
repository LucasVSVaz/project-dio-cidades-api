package br.com.lucasvvaz.cities.api.countries.repository;

import br.com.lucasvvaz.cities.api.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepositoryJPA extends JpaRepository<Country, Long> {
}
