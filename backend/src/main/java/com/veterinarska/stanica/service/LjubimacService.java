package com.veterinarska.stanica.service;

import java.util.List;
import com.veterinarska.stanica.model.Ljubimac;

public interface LjubimacService {

    Ljubimac findById(Long id);

    List<Ljubimac> findAll();

    Ljubimac save(Ljubimac ljubimac);

    void delete(Long id);
}
