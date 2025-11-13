package com.example.olamundospring.controller;         // Package base. Tem de ser o mesmo (ou sub) da classe *Application.


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


//Esta classe vai responder a pedidos HTTP
//@RequestParam = Lê um parâmetro de query string (?name=Joel)
//defaultValue = "World"  Se não vier na URL, usa "World"
//String name = Variável que receberá o valor do parâmetro "name"
//return "Hello " + name; = Resposta como texto simples (HTTP 200, text/plain)

@RestController     // Diz ao Spring: esta classe expõe endpoints HTTP REST.
public class HelloController {
    @GetMapping("/hello")   // Mapeia requisições GET para /hello
    public String hello(@RequestParam(defaultValue="World") String name) {


        return "Hello " + name;
    }

    //Como chamar
    //
    //GET http://localhost:8080/hello → “Hello World”
    //
    //GET http://localhost:8080/hello?name=Joel → “Hello Joel”
}
