package com.example.demo.controller;

import com.example.demo.model.ServiceModel;
import com.example.demo.service.DomainService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/services")
@RequiredArgsConstructor
public class ServicesController {

    private final DomainService domainService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ServiceModel create(@RequestBody ServiceModel serviceModel) {
        return domainService.create(serviceModel);
    }

    @PutMapping("/{id}")
    public ServiceModel update(ServiceModel serviceModel, @PathVariable Long id) {
        serviceModel.setId(id);
        return domainService.update(serviceModel);
    }

    @GetMapping("/{id}")
    public ServiceModel details(@PathVariable Long id) {
        return domainService.details(id);
    }

    @GetMapping
    public List<ServiceModel> list() {
        return domainService.list();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        domainService.delete(id);
    }

}
