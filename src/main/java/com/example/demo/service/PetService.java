package com.example.demo.service;

import com.example.demo.model.Pet;
import com.example.demo.repository.PetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
@RequiredArgsConstructor
public class PetService {
    private final PetRepository repository;

    public Pet create(Pet pet) {
        return repository.save(pet);
    }

    public Pet details(Long id) {
        return repository.findById(id).orElseThrow(()-> {
            throw new EntityNotFoundException();
        });
    }
}
