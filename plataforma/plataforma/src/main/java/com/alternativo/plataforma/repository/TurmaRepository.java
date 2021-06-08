package com.alternativo.plataforma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alternativo.plataforma.model.Turma;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Long>{

}
