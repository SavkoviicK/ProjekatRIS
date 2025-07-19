package com.veterinarska.stanica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.veterinarska.stanica.model.Termin;

@Repository
public interface TerminRepository extends JpaRepository<Termin, Long> {

}
