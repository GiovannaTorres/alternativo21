package com.alternativo.plataforma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alternativo.plataforma.model.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno,Long>{

}
