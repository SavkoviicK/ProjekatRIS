package com.veterinarska.stanica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.veterinarska.stanica.model.Lek;

@Repository
public interface LekRepository extends JpaRepository<Lek, Long> {

}
