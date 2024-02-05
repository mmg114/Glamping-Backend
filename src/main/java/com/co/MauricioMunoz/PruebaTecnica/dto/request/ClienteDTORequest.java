package com.co.MauricioMunoz.PruebaTecnica.dto.request;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.UUID;

@Data
@Builder
public class ClienteDTORequest {

    private UUID id;

    @NotNull(message = "Ingrese el nombre del Cliente")
    private String nombre;

    @NotNull(message = "Ingrese el apellido del cliente")
    private String apellido;

    @NotNull(message = "Ingrese el documento del cliente")
    private String documento;

    private Date fechaNacimiento;

    @Email(regexp = "^[a-zA-Z0-9._%+-]+@dominio\\.co$", message = "Ingresar el correo del cliente con formato {usuario}@dominio.co")
    private String email;
}
