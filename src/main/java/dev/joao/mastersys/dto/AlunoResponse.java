package dev.joao.mastersys.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import dev.joao.mastersys.model.Aluno;

public record AlunoResponse(
    Long id,
    String nome,
    LocalDate dataNascimento,
    String sexo,
    String telefone,
    String celular,
    String email,
    String observacao,
    String endereco,
    String numero,
    String bairro,
    String cidade,
    String estado,
    String cep,
    LocalDateTime criadoEm,
    LocalDateTime atualizadoEm
) {

    public AlunoResponse(Aluno aluno) {
        this(
            aluno.getId(),
            aluno.getNome(),
            aluno.getDataNascimento(),
            aluno.getSexo(),
            aluno.getTelefone(),
            aluno.getCelular(),
            aluno.getEmail(),
            aluno.getObservacao(),
            aluno.getEndereco(),
            aluno.getNumero(),
            aluno.getBairro(),
            aluno.getCidade(),
            aluno.getEstado(),
            aluno.getCep(),
            aluno.getCriadoEm(),
            aluno.getAtualizadoEm()
        );
    }
}
