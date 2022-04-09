package com.viniciusysr.icqusers.services;

import com.viniciusysr.icqusers.domain.Inspectors;
import com.viniciusysr.icqusers.repository.InspectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InspectorService {

    @Autowired
    private InspectorRepository repo;

    public List<Inspectors> findAll() {
        return repo.findAll();
    }
}

