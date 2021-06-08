package com.alternativo.plataforma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alternativo.plataforma.model.Entrega;
import com.alternativo.plataforma.repository.EntregaRepository;

@RestController
@RequestMapping("/entregas")
@CrossOrigin(origins="*", allowedHeaders="*")
public class EntregaController {
	
	@Autowired
	private EntregaRepository repository;
	
	@GetMapping
	public ResponseEntity <List<Entrega>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}

}
