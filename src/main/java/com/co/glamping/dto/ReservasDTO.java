package com.co.glamping.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
public class ReservasDTO {

    Long glampingId;
    String nombreGlamping;
    LocalDate fechaInicioReserva;
    LocalDate fechaFinReserva;
    String estadoGlamping;
    BigDecimal abonado;
    ClienteDTO cliente;
    Long usuarioId;
    String nombreCliente;

}
