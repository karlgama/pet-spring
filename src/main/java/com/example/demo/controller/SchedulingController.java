package com.example.demo.controller;

import com.example.demo.model.Scheduling;
import com.example.demo.service.SchedulingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/schedules")
public class SchedulingController {
    private final SchedulingService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Scheduling create(@RequestBody Scheduling scheduling) {
        return service.create(scheduling);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.CREATED)
    public List<Scheduling> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public Scheduling details(@PathVariable Long id) {
        return service.details(id);
    }

    @PutMapping("/{id}")
    public Scheduling update(@PathVariable Long id, @RequestBody Scheduling scheduling) {
        return service.update(id, scheduling);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
