package com.alternativo.plataforma.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_aluno")
public class Aluno extends Usuario{
	
	@ManyToOne
	private Turma turma;

	
	//getters and setters
	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
	
	
	

}
