package com.viniciusysr.icqusers.services;

import com.viniciusysr.icqusers.domain.Inspector;
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

    public List<Inspector> findAll() {
        return repo.findAll();
    }

    public Inspector findById(String id) {
        Optional<Inspector> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjNotFoundException("Object not found!"));
    }

    public Inspector insert(Inspector obj){
        return repo.insert(obj);
    }

    public void delete(String id){
        findById(id);
        repo.deleteById(id);
    }

    public Inspector update(Inspector obj){
        Inspector newObj = findById(obj.getId());
        updateData(newObj, obj);
        return repo.save(newObj);
    }

    private void updateData(Inspector newObj, Inspector obj) {
        newObj.setName(obj.getName());
        newObj.setEmail(obj.getEmail());
    }


    public Inspector fromDTO(InspectorDTO objDto){
        return new Inspector(objDto.getId(), objDto.getName(), objDto.getEmail());
    }

}

