package com.veterinarska.stanica.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Korisnik")

public class Korisnik {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String ime;
	
	@Column(nullable = false)
	private String prezime;
	
	@Column(nullable = false, unique = true)
	private String email;
	
	@Column(nullable = false)
	private String password;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private Uloga uloga;
	
	@Column(nullable = false)
	private boolean enabled = true;
	
	// Konstruktori, geteri, seteri
	
	public Korisnik() {
		
	}
	
	// Getteri
	
	public Long getId() {
		return id;
	}
	
	public String getIme() {
		return ime;
	}
	
	public String getPrezime() {
		return prezime;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public Uloga getUloga() {
		return uloga;
	}

	public boolean isEnabled() {
		return enabled;
	}
	
	//Seteri
	
	public void setId(Long id) {
		this.id = id;
	}
	

	public void setIme(String ime) {
		this.ime =ime;
	}
	

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public void setPassword(String password) {
		this.password = password;
	}
	

	public void setUloga(Uloga uloga) {
		this.uloga = uloga;
	}
	

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
}
