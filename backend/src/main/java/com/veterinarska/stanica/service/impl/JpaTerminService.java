package com.veterinarska.stanica.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.veterinarska.stanica.model.Termin;
import com.veterinarska.stanica.repository.TerminRepository;
import com.veterinarska.stanica.service.TerminService;

@Service
public class JpaTerminService implements TerminService {

    @Autowired
    private TerminRepository terminRepository;

    @Override
    public Termin findById(Long id) {
        return terminRepository.findById(id).orElse(null);
    }

    @Override
    public List<Termin> findAll() {
        return terminRepository.findAll();
    }

    @Override
    public Termin save(Termin termin) {
        return terminRepository.save(termin);
    }

    @Override
    public void delete(Long id) {
        terminRepository.deleteById(id);
    }
}
