package dev.joao.mastersys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.joao.mastersys.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{
    
}
