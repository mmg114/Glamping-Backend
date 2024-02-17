package com.co.glamping.service;

import com.co.glamping.dto.ReservasDTO;
import com.co.glamping.dto.response.ReservasDTOResponse;

import java.util.List;

public interface IReservasService {

    public List<ReservasDTOResponse> reservasDashboard();

    ReservasDTOResponse getReservaById(Long reservaId);

    ReservasDTOResponse createReserva(ReservasDTO reserva);

    ReservasDTOResponse updateReserva(Long reservaId, ReservasDTO reserva);

    Void deleteReserva(Long reservaId);
}
