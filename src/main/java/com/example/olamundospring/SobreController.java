package com.example.olamundospring;

import com.example.olamundospring.dto.SobreDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SobreController {



    @Value( "${app.nome:Aplicacao}")
    private String appNome;

    @Value( "${app.versao:dev}")
    private String appVersao;

    @GetMapping("/sobre")
    public SobreDTO sobre() {
        return new SobreDTO(appNome, appVersao);
    }




}
