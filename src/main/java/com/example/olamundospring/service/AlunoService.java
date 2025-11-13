package com.example.olamundospring.service;


import com.example.olamundospring.model.Aluno;
import com.example.olamundospring.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public List<Aluno> listarAlunos() {
        return alunoRepository.findAll();
    }

    public Aluno adicionar(Aluno aluno){
        return alunoRepository.save(aluno);
    }
}
