package com.veterinarska.stanica.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Pregled")
public class Pregled {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "termin_id", nullable = false, unique = true)
    private Termin termin;

    @Column(columnDefinition = "TEXT")
    private String opisStanja;

    @Column(columnDefinition = "TEXT")
    private String dijagnoza;

    @Column(columnDefinition = "TEXT")
    private String propisanaTerapija;

    // Getteri i seteri

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Termin getTermin() {
        return termin;
    }

    public void setTermin(Termin termin) {
        this.termin = termin;
    }

    public String getOpisStanja() {
        return opisStanja;
    }

    public void setOpisStanja(String opisStanja) {
        this.opisStanja = opisStanja;
    }

    public String getDijagnoza() {
        return dijagnoza;
    }

    public void setDijagnoza(String dijagnoza) {
        this.dijagnoza = dijagnoza;
    }

    public String getPropisanaTerapija() {
        return propisanaTerapija;
    }

    public void setPropisanaTerapija(String propisanaTerapija) {
        this.propisanaTerapija = propisanaTerapija;
    }
}
