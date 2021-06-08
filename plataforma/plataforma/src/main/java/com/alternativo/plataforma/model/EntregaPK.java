package com.alternativo.plataforma.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;


@Embeddable
public class EntregaPK implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManyToOne
	@NotNull
	private Atividade atividade;
	
	@NotNull
	@ManyToOne
	private Aluno aluno;
}
