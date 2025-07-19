package com.veterinarska.stanica.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Ljubimac")

public class Ljubimac {
	
	@Id
	@GeneratedValue(startegy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String ime;
	
	@Column(nullable = false)
	private String = vrsta;
	
	private String rasa;
	
	@Enumerated(EnumType.STRING)
	private Pol pol;
	
	private LocalDate datum_rodjenja;
	
	@ManyToOne(fetc = FetchType.LAZY)
	@JoinColumn(name = "vlasnik_id", nullable = false)
	private Korisnik vlasnik;
	
	// Geteri i seteri
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getIme() {
		return ime;
	}
	
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	public String getVrsta() {
		return vrsta;
	}
	
	public void setVrsta(String vrsta) {
		this.vrsta = vrsta;
	}
	
	public String getRasa() {
		return rasa;
	}
	
	public void setRasa(String rasa) {
		this.rasa = rasa;
	}
	
	public Pol getPol() {
		return pol;
	}
	
	public void setPol(Pol pol) {
		this.pol = pol;
	}
	
	public LocalDate getDatum_rodjenja() {
		return datum_rodjenja;
	}
	
	public void setDatum_rodjenja(LocalDate datum_rodjenja) {
		this.datum_rodjenja = datum_rodjenja;
	}
	
	public Korisnik getVlasnik() {
		return vlasnik;
	}
	
	public void setVlasnik(Korisnik vlasnik) {
		this.vlasnik = vlasnik;
	}

}
