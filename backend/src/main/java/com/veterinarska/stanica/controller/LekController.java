package com.veterinarska.stanica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.veterinarska.stanica.model.Lek;
import com.veterinarska.stanica.service.LekService;

@RestController
@RequestMapping("/api/lekovi")

public class LekController {

	@Autowired
	private LekService lekService;
	
	@GetMapping
	public List<Lek> getAll(){
		return lekService.findAll();
	}
	
	@PostMapping
	public Lek create(@RequestBody Lek lek) {
		return lekService.save(lek);
	}
	
	@GetMapping("/{id}")
	public Lek getOne(@PathVariable Long id) {
		return lekService.findById(id);
	}
	
	@PutMapping("/{id}")
    public Lek update(@PathVariable Long id, @RequestBody Lek lek) {
        lek.setId(id);
        return lekService.save(lek);
    }
	
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        lekService.delete(id);
    }
}
