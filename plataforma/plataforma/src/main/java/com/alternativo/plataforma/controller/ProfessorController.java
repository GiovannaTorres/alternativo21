package com.alternativo.plataforma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alternativo.plataforma.model.Professor;
import com.alternativo.plataforma.repository.ProfessorRepository;

@RestController
@RequestMapping("/professores")
@CrossOrigin(origins="*", allowedHeaders="*")
public class ProfessorController {
	
	@Autowired
	private ProfessorRepository repository;
	
	@GetMapping
	public ResponseEntity <List<Professor>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}

}
