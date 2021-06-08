package com.alternativo.plataforma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alternativo.plataforma.model.Turma;
import com.alternativo.plataforma.repository.TurmaRepository;

@RestController
@RequestMapping("/turmas")
@CrossOrigin(origins="*", allowedHeaders="*")
public class TurmaController {
	
	@Autowired
	private TurmaRepository repository;
	
	@GetMapping
	public ResponseEntity <List<Turma>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}

}
