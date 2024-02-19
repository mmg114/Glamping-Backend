package com.co.glamping.dto.response;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class DashboardDTO {

    private Long reporteVentasTotales;
    private Long reporteReservasTotales;
    private Long reporteReservasAbonadas;

    private List<ReservasDTOResponse> reservas;
}
