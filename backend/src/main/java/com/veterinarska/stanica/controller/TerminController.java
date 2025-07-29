package com.veterinarska.stanica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.veterinarska.stanica.model.Termin;
import com.veterinarska.stanica.service.TerminService;

@RestController
@RequestMapping("/api/termini")
public class TerminController {

    @Autowired
    private TerminService terminService;

    // Dodaj sve termine
    @GetMapping
    public List<Termin> getAll() {
        return terminService.findAll();
    }

    // Kreiraj novi termin
    @PostMapping
    public Termin create(@RequestBody Termin termin) {
        return terminService.save(termin);
    }

    // Dodaj jedan termin po ID-ju
    @GetMapping("/{id}")
    public Termin getOne(@PathVariable Long id) {
        return terminService.findById(id);
    }

    // Azuriraj termin
    @PutMapping("/{id}")
    public Termin update(@PathVariable Long id, @RequestBody Termin termin) {
        termin.setId(id);
        return terminService.save(termin);
    }

    // Obrisi termin
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        terminService.delete(id);
    }

}
