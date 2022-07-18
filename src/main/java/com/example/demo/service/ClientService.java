package com.example.demo.service;

import com.example.demo.model.Client;
import com.example.demo.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@AllArgsConstructor
public class ClientService {
    private final ClientRepository repository;

    public List<Client> findAll() {
        return repository.findAll();
    }

    public Client create(Client client) {
        return repository.save(client);
    }

    public Client update(Client client) {
        details(client.getId());
        return repository.save(client);
    }

    public Client details(Long id) {
        return repository.findById(id).orElseThrow(()->{
            throw new EntityNotFoundException();
        });
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
