/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alunoapi.repository;

import br.com.alunoapi.model.Aluno;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author mateus
 */
public interface AlunoRepository extends CrudRepository<Aluno, Long> {
    
}
