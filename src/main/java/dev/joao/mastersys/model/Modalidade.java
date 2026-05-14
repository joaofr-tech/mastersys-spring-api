package dev.joao.mastersys.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "modalidades")
public class Modalidade {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Boolean ativa = true;


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean isAtiva() {
        return this.ativa;
    }

    public Boolean getAtiva() {
        return this.ativa;
    }

    public void setAtiva(Boolean ativa) {
        this.ativa = ativa;
    }

}
