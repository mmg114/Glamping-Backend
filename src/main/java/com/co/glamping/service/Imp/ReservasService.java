package com.co.glamping.service.Imp;

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
}
