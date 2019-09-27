package com.rest.api.alunos.restAPIalunos.alunos;

import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping(path = "/aluno")
public class AlunoController {

    @PostMapping(path = "/login")
    public ResponseEntity login(Principal principal) {
        return ResponseEntity.ok("Login realizado com sucesso");
    }



    @GetMapping(path = "/visualiarNotas")
    public ResponseEntity obterNostas() {
        return ResponseEntity.ok("Conteúdo sensivel");
    }
}
