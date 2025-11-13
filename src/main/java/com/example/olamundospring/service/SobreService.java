package com.example.olamundospring.service;


import com.example.olamundospring.dto.SobreDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SobreService {
    @Value("${app.nome}")
    private  String nome;
    @Value("${app.versao}")
    private  String versao;

    public SobreDTO obterInfo() {
        return new SobreDTO(nome, versao);
    }

}
