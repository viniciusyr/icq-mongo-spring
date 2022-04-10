package com.viniciusysr.icqusers.resources;

import com.viniciusysr.icqusers.domain.Inspection;
import com.viniciusysr.icqusers.domain.Inspector;
import com.viniciusysr.icqusers.dto.InspectorDTO;
import com.viniciusysr.icqusers.resources.util.URL;
import com.viniciusysr.icqusers.services.InspectionService;
import com.viniciusysr.icqusers.services.InspectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value="/inspections")
public class InspectionResource {

    @Autowired
    private InspectionService service;

    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public ResponseEntity<Inspection> findById(@PathVariable String id) {
        Inspection obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @RequestMapping(value="/titlesearch", method= RequestMethod.GET)
    public ResponseEntity<List<Inspection>> findByTitle(@RequestParam(value="text", defaultValue = "") String text) {
        text = URL.decodeParam(text);
        List<Inspection> list = service.findByTitle(text);
        return ResponseEntity.ok().body(list);
    }

    @RequestMapping(value="/fullsearch", method= RequestMethod.GET)
    public ResponseEntity<List<Inspection>> fullSearch(
            @RequestParam(value="text", defaultValue = "") String text,
            @RequestParam(value="minDate", defaultValue = "") String minDate,
            @RequestParam(value="maxDate", defaultValue = "") String maxDate) {
        text = URL.decodeParam(text);
        Date min = URL.convertDate(minDate, new Date(0L));
        Date max = URL.convertDate(maxDate, new Date());
        List<Inspection> list = service.fullSearch(text, min, max);
        return ResponseEntity.ok().body(list);
    }

}
