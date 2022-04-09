package com.viniciusysr.icqusers.config;

import com.viniciusysr.icqusers.domain.Inspectors;
import com.viniciusysr.icqusers.repository.InspectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private InspectorRepository inspectorRepository;

    @Override
    public void run(String... args) throws Exception {

        inspectorRepository.deleteAll();

        Inspectors vinicius = new Inspectors(null, "Vinicius Rodrigues", "qualidade2@isma.com.br");
        Inspectors joao = new Inspectors(null, "Joao Victor Fernandes", "qualidade4@isma.com.br");
        Inspectors mario = new Inspectors(null, "Mario dos Santos", "qualidade5@isma.com.br");

         inspectorRepository.saveAll(Arrays.asList(vinicius, joao, mario));


    }
}
