package com.hector.consumodeapi;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class personasllamada {
    @SerializedName("success")
    private String success;

    @SerializedName("message")
    private String message;

    @SerializedName("details")
    private List<InfoPersonas> Persona;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<InfoPersonas> getInfoPersona() {
        return Persona;
    }

    public void setInfoPersona(List<InfoPersonas> infopersona) {
        this.Persona = infopersona;
    }
}
