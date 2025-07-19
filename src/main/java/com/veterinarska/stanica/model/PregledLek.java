package com.veterinarska.stanica.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name = "Pregled_Lek")
public class PregledLek {

    @EmbeddedId
    private PregledLekId id;

    @ManyToOne
    @MapsId("pregledId")
    @JoinColumn(name = "pregled_id")
    private Pregled pregled;

    @ManyToOne
    @MapsId("lekId")
    @JoinColumn(name = "lek_id")
    private Lek lek;

    private String kolicina;

    // Getteri i seteri

    public PregledLekId getId() {
        return id;
    }

    public void setId(PregledLekId id) {
        this.id = id;
    }

    public Pregled getPregled() {
        return pregled;
    }

    public void setPregled(Pregled pregled) {
        this.pregled = pregled;
    }

    public Lek getLek() {
        return lek;
    }

    public void setLek(Lek lek) {
        this.lek = lek;
    }

    public String getKolicina() {
        return kolicina;
    }

    public void setKolicina(String kolicina) {
        this.kolicina = kolicina;
    }
}
