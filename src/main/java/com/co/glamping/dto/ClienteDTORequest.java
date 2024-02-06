package com.co.glamping.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Builder
public class ClienteDTORequest {

    private UUID id;
    private String nombre;
    private String apellido;
    private String documento;
    private String tipoDocumento;
    private LocalDate fechaNacimiento;
    private String correoElectronico;
}
