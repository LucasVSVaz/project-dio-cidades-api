package br.com.lucasvvaz.cities.api.states.services;

import br.com.lucasvvaz.cities.api.states.entities.State;
import br.com.lucasvvaz.cities.api.states.repository.StateRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StateService {
    private StateRepository repository;

    public List<State> getAll() {
        return repository.findAll();
    }

    public State getById(Long id) {
        return repository.findById(id).get();
    }
}
