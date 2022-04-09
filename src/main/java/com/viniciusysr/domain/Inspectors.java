package com.viniciusysr.domain;

import java.io.Serializable;
import java.util.Objects;

public class Inspectors implements Serializable {

    private String id;
    private String nome;
    private String email;

    public Inspectors() {

    }

    public Inspectors(String id, String name, String email) {
        this.id = id;
        this.nome = name;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inspectors that = (Inspectors) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
