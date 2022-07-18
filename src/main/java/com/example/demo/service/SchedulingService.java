package com.example.demo.service;

import com.example.demo.model.Scheduling;
import com.example.demo.repository.SchedulingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SchedulingService {
    private final SchedulingRepository repository;

    public Scheduling create(Scheduling scheduling) {
        return repository.save(scheduling);
    }

    public Scheduling details(Long id) {
        return repository.findById(id).orElseThrow(()->{
            throw new EntityNotFoundException();
        });
    }

    public Scheduling update(Long id, Scheduling scheduling) {
        details(id);
        scheduling.setId(id);
        return repository.save(scheduling);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public List<Scheduling> list() {
        return repository.findAll();
    }
}
