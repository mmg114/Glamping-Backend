package com.co.glamping.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
public class ReservasDTO {
    private Long reservaId;
    private String nombreGlamping;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Long glamping;
    private BigDecimal abonado;
    private Long usuarioId;
    private String nombreCliente;
    private Long cliente;
    private Long estado;

}
