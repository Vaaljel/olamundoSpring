package com.example.olamundospring;

import com.example.olamundospring.dto.SobreDTO;         // Importa o DTO para devolver JSON tipado.
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController    // Expõe endpoints REST.
public class SobreController {



    @Value( "${app.nome:Aplicacao}")          // Injeta valor da propriedade app.nome; se faltar, usa "Aplicacao".
    private String appNome;

    @Value( "${app.versao:dev}")               // Injeta app.versao; se faltar, usa "dev".
    private String appVersao;

    @GetMapping("/sobre")        // GET /sobre
    public SobreDTO sobre() {      // O retorno é um DTO -> Spring/Jackson serializa para JSON.
        return new SobreDTO(appNome, appVersao);  // Ex.: {"nome":"Olá Mundo Spring Boot","versao":"1.0.0"}
    }




}
