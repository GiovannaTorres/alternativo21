package com.alternativo.plataforma.model;

import java.time.OffsetDateTime;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.URL;


public class Entrega {
	
	@URL
	private String link;
	
	@Size(max=300)
	private String observacao;
	
	private OffsetDateTime data;

	
	//getters and setters
	
	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public OffsetDateTime getData() {
		return data;
	}

	public void setData(OffsetDateTime data) {
		this.data = data;
	}
	
	

}
