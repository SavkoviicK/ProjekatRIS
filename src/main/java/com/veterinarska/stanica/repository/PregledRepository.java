package com.veterinarska.stanica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.veterinarska.stanica.model.Pregled;

@Repository
public interface PregledRepository extends JpaRepository<Pregled, Long> {

}
