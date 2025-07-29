package com.veterinarska.stanica.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.veterinarska.stanica.model.Pregled;
import com.veterinarska.stanica.repository.PregledRepository;
import com.veterinarska.stanica.service.PregledService;

@Service
public class JpaPregledService implements PregledService {

    @Autowired
    private PregledRepository pregledRepository;

    @Override
    public Pregled findById(Long id) {
        return pregledRepository.findById(id).orElse(null);
    }

    @Override
    public List<Pregled> findAll() {
        return pregledRepository.findAll();
    }

    @Override
    public Pregled save(Pregled pregled) {
        return pregledRepository.save(pregled);
    }

    @Override
    public void delete(Long id) {
        pregledRepository.deleteById(id);
    }
}
