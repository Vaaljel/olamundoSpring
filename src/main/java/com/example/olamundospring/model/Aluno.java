package com.example.olamundospring.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String curso;
    private Integer ano;
    private String linguagem;

    public Aluno() {}

    public Aluno(String nome, String curso, Integer ano, String linguagem) {
        this.nome = nome;
        this.curso = curso;
        this.ano = ano;
        this.linguagem = linguagem;
    }

    // Getters
    public Long getId() { return id;}
    public String getNome() { return nome;}
    public String getCurso() { return curso;}
    public Integer getAno() { return ano;}
    public String getLinguagem() { return linguagem;}

    // Setters
    public void setId(Long id) { this.id = id;}
    public void setNome(String nome) { this.nome = nome;}
    public void setCurso(String curso) { this.curso = curso;}
    public void setAno(Integer ano) { this.ano = ano;}
    public void setLinguagem(String linguagem) { this.linguagem = linguagem;}


}
