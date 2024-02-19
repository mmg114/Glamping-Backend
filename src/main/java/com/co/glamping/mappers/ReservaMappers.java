package com.co.glamping.mappers;

import com.co.glamping.dto.ReservasDTO;
import com.co.glamping.model.Reserva;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ReservaMappers {

    public  ReservasDTO toDTO(List<Reserva> list) {
        return ReservasDTO.builder()
                .glamping(list.getGlamping().getGlampingId())
                .nombreGlamping(list.getGlamping().getNombre())
                .fechaInicio(list.getFechaInicio())
                .fechaFin(list.getFechaFin())
                .abonado(list.getAbono())
                .cliente(list.getCliente().getClienteId())
                .usuarioId(list.getUsuario().getUsuarioId())
                .nombreCliente(list.getCliente().getNombre())
                .estado(list.getEstado().getEstadoId())
                .build();
    }
}
