package com.example.demo.service;

import com.example.demo.model.ServiceModel;
import com.example.demo.repository.ServiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DomainService {
    private final ServiceRepository repository;

    public ServiceModel create(ServiceModel serviceModel) {
        return repository.save(serviceModel);
    }

    public ServiceModel details(Long id) {
        return repository.findById(id).orElseThrow(()->{
            throw new EntityNotFoundException();
        });
    }

    public ServiceModel update(ServiceModel serviceModel) {
        return repository.save(serviceModel);
    }

    public List<ServiceModel> list() {
        return repository.findAll();
    }

    public void delete(Long id){
        repository.deleteById(id);
    }
}
