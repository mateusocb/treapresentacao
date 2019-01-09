/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alunoapi.controller;

import br.com.alunoapi.model.Aluno;
import br.com.alunoapi.repository.AlunoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mateus
 */
@RestController
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @RequestMapping(value = "/alunos", method = RequestMethod.GET)
    public List<Aluno> getAlunos() {
        List<Aluno> alunos = (List<Aluno>) alunoRepository.findAll();

        return alunos;
    }

    @RequestMapping(value = "/aluno/{matricula}", method = RequestMethod.GET)
    public Aluno getAlunoMatricula(@PathVariable("matricula") String matricula) {

        return new Aluno("Mateus", "0001");
    }

    @RequestMapping(value = "/aluno/{matricula}", method = RequestMethod.DELETE)
    public void deleteAlunoMatricula(@PathVariable("matricula") String matricula) {

    }

    @RequestMapping(value = "/aluno/{matricula}", method = RequestMethod.PATCH)
    public void updateAlunoMatricula(@PathVariable("matricula") String matricula) {
    }

    @RequestMapping(value = "/aluno", method = RequestMethod.POST)
    public ResponseEntity addAluno(@RequestParam("nome") String nome,
            @RequestParam("matricula") String matricula) {

        try {
            alunoRepository.save(new Aluno("Mateus", "0001"));

            return new ResponseEntity(HttpStatus.ACCEPTED);
        } catch (Exception e) {
            System.err.println(e.getMessage());

            return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
        }
    }
}
