package com.viniciusysr.resources;

import java.util.ArrayList;
import java.util.List;

import com.viniciusysr.domain.Inspectors;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/inspectors")
public class InspectorResource {

    @GetMapping
    public ResponseEntity <List<Inspectors>>findAll() {
        Inspectors joao = new Inspectors("1", "Joao", "joao@gmail.com");
        List<Inspectors> list = new ArrayList<>(List.of(joao));
        return ResponseEntity.ok().body(list);

    }
}
