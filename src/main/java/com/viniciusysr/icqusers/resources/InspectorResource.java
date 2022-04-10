package com.viniciusysr.icqusers.resources;

import java.net.URI;
import java.util.List;

import com.viniciusysr.icqusers.domain.Inspectors;
import com.viniciusysr.icqusers.dto.InspectorDTO;
import com.viniciusysr.icqusers.services.InspectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping(value="/inspectors")
public class InspectorResource {

    @Autowired
    private InspectorService service;

    @RequestMapping(method= RequestMethod.GET)
    public ResponseEntity <List<InspectorDTO>>findAll() {
        List<Inspectors> list = service.findAll();
        List<InspectorDTO> listDto = list.stream().map(InspectorDTO::new).toList();
        return ResponseEntity.ok().body(listDto);
    }
    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public ResponseEntity<InspectorDTO> findById(@PathVariable String id) {
        Inspectors obj = service.findById(id);
        return ResponseEntity.ok().body(new InspectorDTO(obj));
    }

    @PostMapping
    public ResponseEntity<Void> insert(@RequestBody InspectorDTO objDto) {
        Inspectors obj = service.fromDTO(objDto);
        obj = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @RequestMapping(value="/{id}", method= RequestMethod.DELETE)
    public ResponseEntity<Void> delete(@PathVariable String id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

}
