package com.example.olamundospring.controller;

import com.example.olamundospring.dto.SobreDTO;         // Importa o DTO para devolver JSON tipado.
import com.example.olamundospring.service.SobreService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController    // Expõe endpoints REST.
public class SobreController {

    private final SobreService sobreService;

    public SobreController(SobreService sobreService) {
        this.sobreService = sobreService;
    }
    @GetMapping("/sobre")
    public SobreDTO obterInfo() {
        return sobreService.obterInfo();
    }




}
