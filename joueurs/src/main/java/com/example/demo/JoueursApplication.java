package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.example.demo.entities.Equipe;
import com.example.demo.entities.Joueur;

@SpringBootApplication
public class JoueursApplication implements CommandLineRunner {
@Autowired
private RepositoryRestConfiguration repositoryRestConfiguration;
public static void main(String[] args) {
SpringApplication.run(JoueursApplication.class, args);
}
@Override
public void run(String... args) throws Exception {
      repositoryRestConfiguration.exposeIdsFor(Joueur.class,Equipe.class);
}
}
