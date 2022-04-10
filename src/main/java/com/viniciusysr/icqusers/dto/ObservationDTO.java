package com.viniciusysr.icqusers.dto;

import java.io.Serializable;
import java.util.Date;

public class ObservationDTO implements Serializable {

    private String text;
    private Date date;
    private RespInscDTO inspector;

    public ObservationDTO(){

    }

    public ObservationDTO(String text, Date date, RespInscDTO inspector) {
        this.text = text;
        this.date = date;
        this.inspector = inspector;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public RespInscDTO getInspector() {
        return inspector;
    }

    public void setInspector(RespInscDTO inspector) {
        this.inspector = inspector;
    }
}
