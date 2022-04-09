package com.viniciusysr.icqusers.dto;

import com.viniciusysr.icqusers.domain.Inspectors;

import java.io.Serial;
import java.io.Serializable;

public final class InspectorDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    private String email;

    public InspectorDTO() {

    }

    public InspectorDTO(Inspectors obj) {
        id = obj.getId();
        name = obj.getName();
        email = obj.getEmail();
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
