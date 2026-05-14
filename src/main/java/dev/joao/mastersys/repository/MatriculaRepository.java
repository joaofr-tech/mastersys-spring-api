package dev.joao.mastersys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.joao.mastersys.model.Matricula;

public interface MatriculaRepository extends JpaRepository<Matricula, Long>{
     
}
