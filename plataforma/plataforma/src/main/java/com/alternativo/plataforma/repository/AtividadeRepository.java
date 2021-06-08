package com.alternativo.plataforma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alternativo.plataforma.model.Atividade;

@Repository
public interface AtividadeRepository extends JpaRepository <Atividade, Long>{

}
