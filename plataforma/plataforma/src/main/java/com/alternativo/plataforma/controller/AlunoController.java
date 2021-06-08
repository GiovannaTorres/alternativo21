package com.alternativo.plataforma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alternativo.plataforma.model.Aluno;
import com.alternativo.plataforma.repository.AlunoRepository;

@RestController
@RequestMapping("/alunos")
@CrossOrigin(origins="*", allowedHeaders="*")
public class AlunoController {

	@Autowired
	private AlunoRepository repository;
	
	@GetMapping
	public ResponseEntity <List<Aluno>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
}
