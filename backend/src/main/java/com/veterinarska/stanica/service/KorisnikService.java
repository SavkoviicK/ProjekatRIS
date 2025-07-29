package com.veterinarska.stanica.service;

import java.util.List;
import com.veterinarska.stanica.model.Korisnik;

public interface KorisnikService {

    // Pronalazi jednog korisnika po njegovom ID-ju
    Korisnik findById(Long id);

    // Pronalazi sve korisnike
    List<Korisnik> findAll();

    // Čuva novog ili ažurira postojećeg korisnika
    Korisnik save(Korisnik korisnik);

    // Briše korisnika po njegovom ID-ju
    void delete(Long id);
}
