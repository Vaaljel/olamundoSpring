package com.example.olamundospring.controller;

import com.example.olamundospring.model.Aluno;
import com.example.olamundospring.service.AlunoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class AlunoController {

    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping
    public List<Aluno> listarAlunos() {
        return alunoService.listarAlunos();
    }

    @PostMapping("/alunos")
    public Aluno adicionar(@RequestBody Aluno aluno) {
        return alunoService.adicionar(aluno);
    }
}
