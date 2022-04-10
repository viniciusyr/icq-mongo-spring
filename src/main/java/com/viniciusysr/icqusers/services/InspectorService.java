package com.viniciusysr.icqusers.services;

import com.viniciusysr.icqusers.domain.Inspectors;
import com.viniciusysr.icqusers.dto.InspectorDTO;
import com.viniciusysr.icqusers.repository.InspectorRepository;
import com.viniciusysr.icqusers.services.exception.ObjNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InspectorService {

    @Autowired
    private InspectorRepository repo;

    public List<Inspectors> findAll() {
        return repo.findAll();
    }

    public Inspectors findById(String id) {
        Optional<Inspectors> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjNotFoundException("Object not found!"));
    }

    public Inspectors insert(Inspectors obj){
        return repo.insert(obj);
    }

    public void delete(String id){
        findById(id);
        repo.deleteById(id);
    }

    public Inspectors update(Inspectors obj){
        Inspectors newObj = findById(obj.getId());
        updateData(newObj, obj);
        return repo.save(newObj);
    }

    private void updateData(Inspectors newObj, Inspectors obj) {
        newObj.setName(obj.getName());
        newObj.setEmail(obj.getEmail());
    }


    public Inspectors fromDTO(InspectorDTO objDto){
        return new Inspectors(objDto.getId(), objDto.getName(), objDto.getEmail());
    }

}

