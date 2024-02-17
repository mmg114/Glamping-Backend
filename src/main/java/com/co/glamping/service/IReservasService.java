package com.co.glamping.service;

import com.co.glamping.dto.ReservasDTO;
import com.co.glamping.dto.response.ReservasDTOResponse;

import java.util.List;

public interface IReservasService {

    public List<ReservasDTO> reservasDashboard();

    ReservasDTO getReservaById(Long reservaId);

    ReservasDTO createReserva(ReservasDTO reserva);

    ReservasDTO updateReserva(Long reservaId, ReservasDTO reserva);

    void deleteReserva(Long reservaId);

     List<ReservasDTO> getAll();
}
