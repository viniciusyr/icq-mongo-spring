package com.viniciusysr.icqusers.services;

import com.viniciusysr.icqusers.domain.Inspection;
import com.viniciusysr.icqusers.repository.InspectionsRepository;
import com.viniciusysr.icqusers.services.exception.ObjNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InspectionService {

    @Autowired
    private InspectionsRepository repo;


    public Inspection findById(String id) {
        Optional<Inspection> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjNotFoundException("Object not found!"));
    }

}

