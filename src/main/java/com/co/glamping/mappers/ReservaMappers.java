package com.co.glamping.mappers;

import com.co.glamping.dto.ReservasDTO;
import com.co.glamping.model.Reserva;
import org.springframework.stereotype.Component;

@Component
public class ReservaMappers {

    public  ReservasDTO toDTO(Reserva reserva) {
        return ReservasDTO.builder()
                .glamping(reserva.getGlamping().getGlampingId())
                .nombreGlamping(reserva.getGlamping().getNombre())
                .fechaInicio(reserva.getFechaInicio())
                .fechaFin(reserva.getFechaFin())
                .abonado(reserva.getAbono())
                .cliente(reserva.getCliente().getClienteId())
                .usuarioId(reserva.getUsuario().getUsuarioId())
                .nombreCliente(reserva.getCliente().getNombre())
                .estado(reserva.getEstado().getEstadoId())
                .build();
    }
}
