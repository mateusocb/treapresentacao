/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alunoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author mateus
    */
//@EntityScan(basePackages = {
//            "com.devmedia.server.model"
//            })
//@EnableJpaRepositories(basePackages = {
//            "com.devmedia.server.repository"
//            })
@SpringBootApplication
public class Main {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Main.class, args);
    }
}
