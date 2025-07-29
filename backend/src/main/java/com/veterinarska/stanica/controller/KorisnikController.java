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

import com.veterinarska.stanica.model.Korisnik;
import com.veterinarska.stanica.service.KorisnikService;

@RestController
@RequestMapping("/api/korisnici")
public class KorisnikController {

    @Autowired
    private KorisnikService korisnikService;

    @GetMapping
    public List<Korisnik> getAll() {
        List<Korisnik> korisnici = korisnikService.findAll();
        return korisnici;
    }

    @PostMapping
    public Korisnik create(@RequestBody Korisnik korisnik) {
        Korisnik sacuvaniKorisnik = korisnikService.save(korisnik);
        return sacuvaniKorisnik;
    }

    @GetMapping("/{id}")
    public Korisnik getOne(@PathVariable Long id) {
        Korisnik korisnik = korisnikService.findById(id);
        return korisnik;
    }

    @PutMapping("/{id}")
    public Korisnik update(@PathVariable Long id, @RequestBody Korisnik korisnik) {
        korisnik.setId(id);
        Korisnik azuriraniKorisnik = korisnikService.save(korisnik);
        return azuriraniKorisnik;
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
    	korisnikService.delete(id);
    }

} 
