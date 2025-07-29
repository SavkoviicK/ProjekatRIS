package com.veterinarska.stanica.service;

import java.util.List;
import com.veterinarska.stanica.model.Pregled;

public interface PregledService {

    Pregled findById(Long id);

    List<Pregled> findAll();

    Pregled save(Pregled pregled);

    void delete(Long id);
}
