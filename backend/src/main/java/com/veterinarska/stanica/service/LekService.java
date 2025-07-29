package com.veterinarska.stanica.service;

import java.util.List;
import com.veterinarska.stanica.model.Lek;

public interface LekService {

    Lek findById(Long id);

    List<Lek> findAll();

    Lek save(Lek lek);

    void delete(Long id);
}
