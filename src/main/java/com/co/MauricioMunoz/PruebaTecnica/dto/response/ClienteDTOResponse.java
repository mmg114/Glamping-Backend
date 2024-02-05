package com.co.MauricioMunoz.PruebaTecnica.dto.response;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

@Data
@Builder
public class ClienteDTOResponse {


    private String nombre;
    private String apellido;
    private String documento;
    private LocalDate fechaNacimiento;
    private String email;

}
