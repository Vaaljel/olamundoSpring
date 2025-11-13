package com.example.olamundospring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaudacaoController {
    @GetMapping("/saudacao/{nome}")
    public String saudacao(@PathVariable String nome) {
        return "Olá " + nome + "(via PathVariable)";
    }
}
