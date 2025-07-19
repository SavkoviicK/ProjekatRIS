package com.veterinarska.stanica.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.veterinarska.stanica.model.Korisnik;
import com.veterinarska.stanica.repository.KorisnikRepository;
import com.veterinarska.stanica.service.KorisnikService;

@Service
public class JpaKorisnikService implements KorisnikService {

    @Autowired
    private KorisnikRepository korisnikRepository;

    @Override
    public Korisnik findById(Long id) {
        return korisnikRepository.findById(id).orElse(null);
    }

    @Override
    public List<Korisnik> findAll() {
        return korisnikRepository.findAll();
    }

    @Override
    public Korisnik save(Korisnik korisnik) {
        return korisnikRepository.save(korisnik);
    }

    @Override
    public void delete(Long id) {
        korisnikRepository.deleteById(id);
    }
}
