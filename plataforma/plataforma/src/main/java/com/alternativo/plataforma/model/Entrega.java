package com.alternativo.plataforma.model;

import java.time.OffsetDateTime;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.URL;

@Entity
@Table(name="tb_entrega")
public class Entrega {
	
	@EmbeddedId
	private EntregaPK id;
	
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

	public EntregaPK getId() {
		return id;
	}

	public void setId(EntregaPK id) {
		this.id = id;
	}
	
	
	

}
