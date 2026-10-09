package aula_refeita_sb.techx.controller;

import aula_refeita_sb.techx.dto.AlunoRequest;
import org.jspecify.annotations.NonNull;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aula")

public class PrimeiroController {

    @GetMapping("/ola")
    public String ola(){
        return "ola Spring boot";
    }

}