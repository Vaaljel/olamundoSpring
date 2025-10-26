package com.example.olamundospring.dto;

     // Record = classe imutável com getters, equals, hashCode e toString gerados automaticamente.
    // Serve só para transportar dados na resposta (DTO = Data Transfer Object).
public record SobreDTO(String nome, String versao){

}

