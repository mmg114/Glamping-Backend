package com.co.glamping.service.Imp;

import com.co.glamping.dto.ReservasDTO;
import com.co.glamping.dto.response.ReservasDTOResponse;
import com.co.glamping.repository.ReservasRepository;
import com.co.glamping.service.IReservasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReservasService implements IReservasService {

    private

    @Autowired
    ReservasRepository reservasRepository;
    @Override
    public List<ReservasDTOResponse> reservasDashboard() {
     return null;
        //   return reservasRepository.findByEstadoAndFechaInicio(List.of(Estados.ABONADO,Estados.PAGADO),LocalDate.now());
    }

    @Override
    public ReservasDTOResponse getReservaById(Long reservaId) {
        return null;
    }

    @Override
    public ReservasDTOResponse createReserva(ReservasDTO reserva) {
        return null;
    }

    @Override
    public ReservasDTOResponse updateReserva(Long reservaId, ReservasDTO reserva) {
        return null;
    }

    @Override
    public Void deleteReserva(Long reservaId) {
        return null;
    }
}
