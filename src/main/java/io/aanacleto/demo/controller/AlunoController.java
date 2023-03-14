package io.aanacleto.demo.controller;

import io.aanacleto.demo.model.Aluno;
import io.aanacleto.demo.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @GetMapping
    public List<Aluno> listar(){
        return alunoRepository.findAll();

    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Aluno adicionar(@RequestBody Aluno aluno){
        return alunoRepository.save(aluno);
    }
}
