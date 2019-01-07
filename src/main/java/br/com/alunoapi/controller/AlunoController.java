/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alunoapi.controller;

import br.com.alunoapi.model.Aluno;
import java.util.List;
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
    
    @RequestMapping(value = "/alunos", method = RequestMethod.GET)
    public List<Aluno> getAlunos() {
        return null;
    }
    
    @RequestMapping(value = "/aluno/{matricula}", method = RequestMethod.GET)
    public Aluno getAlunoMatricula
        (@PathVariable("matricula") String matricula) {
        
            return new Aluno(1, "Mateus Bezerra", "0001");
    }
    
    @RequestMapping(value = "/aluno/{matricula}", method = RequestMethod.DELETE)
    public void deleteAlunoMatricula
        (@PathVariable("matricula") String matricula) {
        
    }

    @RequestMapping(value = "/aluno/{matricula}", method = RequestMethod.PATCH)
    public void updateAlunoMatricula
        (@PathVariable("matricula") String matricula) {
    }
        
    @RequestMapping(value = "/aluno", method = RequestMethod.POST)
    public ResponseEntity addAluno
        (@RequestParam("nome") String nome, 
         @RequestParam("matricula") String matricula) {
        
            return new ResponseEntity(HttpStatus.ACCEPTED);
    }
}
