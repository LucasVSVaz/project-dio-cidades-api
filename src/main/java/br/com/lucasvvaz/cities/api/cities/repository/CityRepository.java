package br.com.lucasvvaz.cities.api.cities.repository;

import br.com.lucasvvaz.cities.api.cities.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
