package com.example.demo.controller;

import com.example.demo.model.Pet;
import com.example.demo.service.PetService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pets")
@RequiredArgsConstructor
public class PetController {
    private final PetService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Pet create(@RequestBody Pet pet) {
        return service.create(pet);
    }

    @GetMapping("/{id}")
    public Pet details(@PathVariable Long id) {
        return service.details(id);
    }
}
