package com.veterinarska.stanica.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.veterinarska.stanica.model.Ljubimac;
import com.veterinarska.stanica.repository.LjubimacRepository;
import com.veterinarska.stanica.service.LjubimacService;

@Service
public class JpaLjubimacService implements LjubimacService {

    @Autowired
    private LjubimacRepository ljubimacRepository;

    @Override
    public Ljubimac findById(Long id) {
        return ljubimacRepository.findById(id).orElse(null);
    }

    @Override
    public List<Ljubimac> findAll() {
        return ljubimacRepository.findAll();
    }

    @Override
    public Ljubimac save(Ljubimac ljubimac) {
        return ljubimacRepository.save(ljubimac);
    }

    @Override
    public void delete(Long id) {
        ljubimacRepository.deleteById(id);
    }
}
