package com.viniciusysr.icqusers.dto;

import com.viniciusysr.icqusers.domain.Inspector;

import java.io.Serializable;

public class RespInscDTO implements Serializable {

    private String id;
    private String name;

    private RespInscDTO(){
    }

    public RespInscDTO(Inspector obj){
        id = obj.getId();
        name = obj.getName();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
