package dev.joao.mastersys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.joao.mastersys.model.Assiduidade;

public interface AssiduidadeRepository extends JpaRepository<Assiduidade, Long>{
    
}
