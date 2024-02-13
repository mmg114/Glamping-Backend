//package com.co.glamping.mappers;
//
//import com.co.glamping.dto.response.ReservasDTOResponse;
//import com.co.glamping.service.Imp.model.Reserva;
//import org.mapstruct.Mapper;
//import org.mapstruct.Mapping;
//
//@Mapper(componentModel = "spring")
//public interface ReservaMapper {
//
//
//    @Mapping(target = "nombreGlamping", source = "reserva.glamping.nombre")
//    @Mapping(target = "fechaInicioReserva", source = "reserva.fechaInicio")
//    @Mapping(target = "fechaFinReserva", source = "reserva.fechaFin")
//    @Mapping(target = "estadoGlamping", source = "reserva.estado")
//    @Mapping(target = "abonado", source = "reserva.abono")
//    ReservasDTOResponse ReservaToReservaDTO(Reserva reserva);
//
//    Reserva ReservaDTOToReserva(ReservasDTOResponse reservasDTOResponse);
//
//}
