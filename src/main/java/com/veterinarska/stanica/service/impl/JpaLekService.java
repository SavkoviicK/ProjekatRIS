package com.veterinarska.stanica.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.veterinarska.stanica.model.Lek;
import com.veterinarska.stanica.repository.LekRepository;
import com.veterinarska.stanica.service.LekService;

@Service
public class JpaLekService implements LekService {

    @Autowired
    private LekRepository lekRepository;

    @Override
    public Lek findById(Long id) {
        return lekRepository.findById(id).orElse(null);
    }

    @Override
    public List<Lek> findAll() {
        return lekRepository.findAll();
    }

    @Override
    public Lek save(Lek lek) {
        return lekRepository.save(lek);
    }

    @Override
    public void delete(Long id) {
        lekRepository.deleteById(id);
    }
}
