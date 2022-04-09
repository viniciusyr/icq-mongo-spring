package com.viniciusysr.icqusers.resources;

import java.util.List;

import com.viniciusysr.icqusers.domain.Inspectors;
import com.viniciusysr.icqusers.services.InspectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/inspectors")
public class InspectorResource {

    @Autowired
    private InspectorService service;

    @GetMapping
    public ResponseEntity <List<Inspectors>>findAll() {
        List<Inspectors> list = service.findAll();
        return ResponseEntity.ok().body(list);

    }
}
