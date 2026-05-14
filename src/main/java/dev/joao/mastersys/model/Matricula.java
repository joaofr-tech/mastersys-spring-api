package dev.joao.mastersys.model;

import java.time.LocalDate;

import dev.joao.mastersys.model.enums.StatusMatricula;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name = "matriculas")
public class Matricula {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data_matricula")
    private LocalDate dataMatricula;

    @Column(name = "dia_vencimento")
    private Integer diaVencimento;

    @Column(name = "dia_encerramento")
    private LocalDate diaEncerramento;

    @Enumerated(EnumType.STRING)
    private StatusMatricula statusMatricula = StatusMatricula.ATIVA;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    @PrePersist
    public void prePersist(){
        if (dataMatricula == null){
            dataMatricula = LocalDate.now();
        }
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataMatricula() {
        return this.dataMatricula;
    }

    public void setDataMatricula(LocalDate dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public Integer getDiaVencimento() {
        return this.diaVencimento;
    }

    public void setDiaVencimento(Integer diaVencimento) {
        this.diaVencimento = diaVencimento;
    }

    public LocalDate getDiaEncerramento() {
        return this.diaEncerramento;
    }

    public void setDiaEncerramento(LocalDate diaEncerramento) {
        this.diaEncerramento = diaEncerramento;
    }

    public StatusMatricula getStatusMatricula() {
        return this.statusMatricula;
    }

    public void setStatusMatricula(StatusMatricula statusMatricula) {
        this.statusMatricula = statusMatricula;
    }

    public Aluno getAluno() {
        return this.aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

}
