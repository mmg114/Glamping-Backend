package com.co.glamping.service.Imp;

import com.co.glamping.dto.ReservasDTO;
;
import com.co.glamping.mappers.ReservaMappers;
import com.co.glamping.model.*;
import com.co.glamping.repository.ReservasRepository;
import com.co.glamping.service.IReservasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReservasService implements IReservasService {

    @Autowired
    private ReservaMappers reservasMapper;

    @Autowired
    ReservasRepository reservasRepository;
    @Override
    public List<ReservasDTO> reservasDashboard() {
     return null;
        //   return reservasRepository.findByEstadoAndFechaInicio(List.of(Estados.ABONADO,Estados.PAGADO),LocalDate.now());
    }

    @Override
    public ReservasDTO getReservaById(Long reservaId) {
        return reservasMapper.toDTO(reservasRepository.getReferenceById(reservaId));
    }

    @Override
    public List<ReservasDTO> getAll() {

        return null;//reservasMapper.toDTO(reservasRepository.findAll());
    }

    @Override
    public ReservasDTO createReserva(ReservasDTO reserva) {
        if (reserva!= null){
            throw  new RuntimeException("La reserva no llego");
        }

        if (reserva.getCliente()==null && reserva.getCliente()==0) {
           throw new RuntimeException("Debe enviar un ID de Cliente");
        }
        if (reserva.getGlamping()==0) {
            throw new RuntimeException("Debe enviar un ID de Glamping");
        }
        if (reserva.getFechaInicio()==null) {
            throw new RuntimeException("Debe tener fecha inicio");
        }
        if (reserva.getFechaFin()==null) {
            throw new RuntimeException("Debe tener fecha fin");
        }
        if (reserva.getEstado()==null && reserva.getEstado().equals("")) {
            throw new RuntimeException("Debe Tener un estado");
        }
        if (reserva.getUsuarioId()==null && reserva.getUsuarioId().equals("")) {
            throw new RuntimeException("Debe Tener un usuario Creador");
        }

    //    Reserva reservaSave = reservasMapper.toEntity(reserva);
        return null;//reservasMapper.toDto(reservasRepository.save(reservaSave)) ;
    }

    @Override
    public ReservasDTO updateReserva(Long reservaId, ReservasDTO reserva) {

      /*  if (reserva!= null){
            throw  new RuntimeException("La reserva no llego");
        }
        Reserva reservaTmp= reservasRepository.getReferenceById(reservaId);

        reservaTmp.setAbono(reserva.getAbonado());
        reservaTmp.setEstado(TipoEstado.builder().estadoId(reserva.getEstado()).build());
        reservaTmp.setGlamping(Glamping.builder().glampingId(reserva.getGlampingId()).build());
        reservaTmp.setFechaInicio(reserva.getFechaInicioReserva());
        reservaTmp.setFechaFin(reserva.getFechaFinReserva());
        reservaTmp.setUsuario(Usuario.builder().usuarioId(reserva.getUsuarioId()).build());
        reservaTmp.setCliente(Cliente.builder().clienteId(reserva.getClienteID()).build());
        return reservasMapper.toDto(reservasRepository.save(reservaTmp));*/
        return null;
    }

    @Override
    public void deleteReserva(Long reservaId) {
        Reserva reservaTmp= reservasRepository.getReferenceById(reservaId);
         reservasRepository.delete(reservaTmp);
    }
}
