package dev.joao.mastersys.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import dev.joao.mastersys.dto.AlunoRequest;
import dev.joao.mastersys.dto.AlunoResponse;
import dev.joao.mastersys.service.AlunoService;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    
    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService){
        this.alunoService = alunoService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AlunoResponse cadastrar(@RequestBody AlunoRequest alunoRequest){
        return alunoService.cadastrar(alunoRequest);
    }

    @GetMapping
    public Page<AlunoResponse> listar(Pageable pageable){
        return alunoService.listar(pageable);
    }

    @GetMapping("/{id}")
    public AlunoResponse buscarPorId(@PathVariable Long id){
        return alunoService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public AlunoResponse atualizar(@PathVariable Long id, @RequestBody AlunoRequest alunoRequest){
        return alunoService.atualizar(id, alunoRequest);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void excluir(@PathVariable Long id){
        alunoService.excluir(id);
    }
}
