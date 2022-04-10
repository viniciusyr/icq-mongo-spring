package com.viniciusysr.icqusers.domain;

import com.viniciusysr.icqusers.dto.RespInscDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Document
public class Inspection implements Serializable {

    @Id
    private String id;
    private Date date;
    private String title;
    private String body;
    private RespInscDTO inspector;

    public Inspection() {
    }

    public Inspection(String id, Date date, String title, String body, RespInscDTO inspector) {
        this.id = id;
        this.date = date;
        this.title = title;
        this.body = body;
        this.inspector = inspector;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public RespInscDTO getInspector() {
        return inspector;
    }

    public void setInspector(RespInscDTO inspector) {
        this.inspector = inspector;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inspection that = (Inspection) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
