package dev.joao.mastersys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.joao.mastersys.model.Plano;

public interface PlanoRepository extends JpaRepository<Plano, Long>{
    
}
