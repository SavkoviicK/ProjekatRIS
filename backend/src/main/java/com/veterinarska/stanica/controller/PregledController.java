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

import com.veterinarska.stanica.model.Pregled;
import com.veterinarska.stanica.service.PregledService;

@RestController
@RequestMapping("/api/pregledi")
public class PregledController {

    @Autowired
    private PregledService pregledService;

    // Dobavi sve preglede
    @GetMapping
    public List<Pregled> getAll() {
        return pregledService.findAll();
    }

    // Kreiraj novi pregled
    @PostMapping
    public Pregled create(@RequestBody Pregled pregled) {
        return pregledService.save(pregled);
    }

    // Unesi jedan pregled po ID-ju
    @GetMapping("/{id}")
    public Pregled getOne(@PathVariable Long id) {
        return pregledService.findById(id);
    }

    // Azuriraj pregled
    @PutMapping("/{id}")
    public Pregled update(@PathVariable Long id, @RequestBody Pregled pregled) {
        pregled.setId(id);
        return pregledService.save(pregled);
    }

    // Obrisi pregled
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        pregledService.delete(id);
    }

}
