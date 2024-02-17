package com.co.glamping.dto.response;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Builder
@Data
public class ReservasDTOResponse {

    private String nombreGlamping;
    private LocalDate fechaInicioReserva;
    private LocalDate fechaFinReserva;
    private String estadoGlamping;
    private BigDecimal abonado;
    private String nombreCliente;
}
