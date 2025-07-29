package com.veterinarska.stanica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;


import com.veterinarska.stanica.model.Ljubimac;
import com.veterinarska.stanica.service.LjubimacService;

@RestController
@RequestMapping("/api/ljubimci")
public class LjubimacController {

    @Autowired
    private LjubimacService ljubimacService;

    // Dodaj sve ljubimce
    @GetMapping
    public List<Ljubimac> getAll() {
        return ljubimacService.findAll();
    }
    
    // Kreiraj novog ljubimca
    @PostMapping
    public Ljubimac create(@RequestBody Ljubimac ljubimac) {
    	return ljubimacService.save(ljubimac);
    }
    
 // Unesi jednog ljubimca po ID-ju
    @GetMapping("/{id}")
    public Ljubimac getOne(@PathVariable Long id) {
        return ljubimacService.findById(id);
    }
    
 // Azuriraj ljubimca
    @PutMapping("/{id}")
    public Ljubimac update(@PathVariable Long id, @RequestBody Ljubimac ljubimac) {
        ljubimac.setId(id);
        return ljubimacService.save(ljubimac);
        
    }
    
 // Obriši ljubimca
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        ljubimacService.delete(id);
    }




}
