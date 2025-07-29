package com.veterinarska.stanica.service;

import java.util.List;
import com.veterinarska.stanica.model.Termin;

public interface TerminService {

    Termin findById(Long id);

    List<Termin> findAll();

    Termin save(Termin termin);

    void delete(Long id);
}
