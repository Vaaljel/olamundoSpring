package com.example.olamundospring.controller;

import com.example.olamundospring.exceptions.RecursoNaoEncontradoException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ErrorController {

    @GetMapping("/alunos/{id}")
    public String buscarAluno(@PathVariable int id) {
        if(id != 1) {
            throw new RecursoNaoEncontradoException("Aluno com ID  "+ id +" não foi encontrado");
        }
        return " Aluno encontrado: Joel Vaal ";
    }
    @GetMapping("/test")
    public ResponseEntity<Object> testErro() {
        Map<String, String> resposta = new HashMap<>();
        resposta.put("mensagem", "ocorreu um erro controlado");
        resposta.put("status", "falha");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(resposta);
    }
}
