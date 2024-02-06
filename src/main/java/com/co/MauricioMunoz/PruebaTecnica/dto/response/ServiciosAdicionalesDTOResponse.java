package com.co.MauricioMunoz.PruebaTecnica.dto.response;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class ServiciosAdicionalesDTOResponse {

    @NotNull(message = "El id del servicio no puede ser nulo")
    private Long idServicio;

    @NotBlank(message = "El nombre del servicio no puede estar en blanco")
    private String nombreServicio;

    // Otros campos, getters y setters

    public Long getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(Long idServicio) {
        this.idServicio = idServicio;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }
}
