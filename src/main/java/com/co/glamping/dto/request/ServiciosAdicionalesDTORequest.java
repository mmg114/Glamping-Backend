package com.co.glamping.dto.request;

import javax.validation.constraints.NotBlank;

public class ServiciosAdicionalesDTORequest {

    @NotBlank(message = "El nombre del servicio no puede estar en blanco")
    private String nombreServicio;


    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }
}
