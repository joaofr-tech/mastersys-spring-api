package dev.joao.mastersys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.joao.mastersys.model.Modalidade;

public interface ModalidadeRepository extends JpaRepository<Modalidade, Long>{
    
}
