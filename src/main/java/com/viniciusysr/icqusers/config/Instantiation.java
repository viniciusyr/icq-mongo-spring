package com.viniciusysr.icqusers.config;

import com.viniciusysr.icqusers.domain.Inspection;
import com.viniciusysr.icqusers.domain.Inspector;
import com.viniciusysr.icqusers.dto.RespInscDTO;
import com.viniciusysr.icqusers.repository.InspectionsRepository;
import com.viniciusysr.icqusers.repository.InspectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private InspectorRepository inspectorRepository;

    @Autowired
    private InspectionsRepository inspectionsRepository;

    @Override
    public void run(String... args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        inspectorRepository.deleteAll();
        inspectionsRepository.deleteAll();

        Inspector vinicius = new Inspector(null, "Vinicius Rodrigues", "qualidade2@isma.com.br");
        Inspector joao = new Inspector(null, "Joao Victor Fernandes", "qualidade4@isma.com.br");
        Inspector mario = new Inspector(null, "Mario dos Santos", "qualidade5@isma.com.br");

        inspectorRepository.saveAll(Arrays.asList(vinicius, joao, mario));

        Inspection insp1 = new Inspection(null, sdf.parse("21/03/2022"), "Pedido 000000","LSE 130x55x2300", new RespInscDTO(vinicius));
        Inspection insp2 = new Inspection(null, sdf.parse("22/03/2022"), "Pedido 000001","LSP 130x55x2300", new RespInscDTO(vinicius));

        inspectionsRepository.saveAll(Arrays.asList(insp1, insp2));


    }
}
