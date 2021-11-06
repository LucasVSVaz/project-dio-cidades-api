package br.com.lucasvvaz.cities.api.states.repository;

import br.com.lucasvvaz.cities.api.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State, Long> {
}
