package com.alternativo.plataforma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alternativo.plataforma.model.Atividade;
import com.alternativo.plataforma.repository.AtividadeRepository;

@RestController
@RequestMapping("/atividades")
@CrossOrigin(origins="*", allowedHeaders="*")
public class AtividadeController {
	
	@Autowired
	private AtividadeRepository repository;
	
	@GetMapping
	public ResponseEntity <List<Atividade>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}

}
