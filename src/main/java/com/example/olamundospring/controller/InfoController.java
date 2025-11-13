package com.example.olamundospring.controller;

import com.example.olamundospring.dto.InfoDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

    @GetMapping("/info")
    public InfoDTO info() {
        return new InfoDTO("Joel",
                "Spring Boot",
                2022,
                "Java",
                true
        );
    }
}
