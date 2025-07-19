package com.veterinarska.stanica.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class PregledLekId implements Serializable {

    @Column(name = "pregled_id")
    private Long pregledId;

    @Column(name = "lek_id")
    private Long lekId;

    // Konstruktori, equals i hashCode su obavezni za kompozitne ključeve

    public PregledLekId() {
    }

    public PregledLekId(Long pregledId, Long lekId) {
        this.pregledId = pregledId;
        this.lekId = lekId;
    }

    // Getteri i seteri

    public Long getPregledId() {
        return pregledId;
    }

    public void setPregledId(Long pregledId) {
        this.pregledId = pregledId;
    }

    public Long getLekId() {
        return lekId;
    }

    public void setLekId(Long lekId) {
        this.lekId = lekId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PregledLekId that = (PregledLekId) o;
        return Objects.equals(pregledId, that.pregledId) &&
               Objects.equals(lekId, that.lekId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pregledId, lekId);
    }
}
