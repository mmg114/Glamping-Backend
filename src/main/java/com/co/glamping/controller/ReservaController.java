package com.co.glamping.controller;

import com.co.glamping.dto.ReservasDTO;
import com.co.glamping.dto.response.DashboardDTO;
import com.co.glamping.dto.response.ReservasDTOResponse;
import com.co.glamping.service.IReservasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/reserva")
public class ReservaController {


    @Autowired
    IReservasService iReservasService;

    @CrossOrigin(origins = "*")
    @GetMapping("/dashboard")
    public ResponseEntity<DashboardDTO> getDashboard() {

        List<ReservasDTOResponse> reservasDTOS = new ArrayList<>();
        reservasDTOS.add(
                ReservasDTOResponse.builder()
                        .fechaInicioReserva(LocalDate.now())
                        .estadoGlamping("Activa")
                        .nombreCliente("Mauricio")
                        .build()
        );
        reservasDTOS.add(
                ReservasDTOResponse.builder()
                        .fechaInicioReserva(LocalDate.now())
                        .estadoGlamping("Activa")
                        .nombreCliente("Andres")
                        .build()
        );
        DashboardDTO dbDto = DashboardDTO.builder()
                .reporteReservasAbonadas(10L)
                .reporteVentasTotales(19L)
                .reporteReservasTotales(30L)
                .reservas(reservasDTOS)
                .build();


        return new ResponseEntity<>(dbDto, HttpStatus.OK);
    }


    // Servicio para obtener una reserva por ID
    @GetMapping("/{reservaId}")
    public ResponseEntity<ReservasDTO> getReserva(@PathVariable Long reservaId) {
        return new ResponseEntity<>(iReservasService.getReservaById(reservaId), HttpStatus.OK);
    }

    // Servicio para crear una nueva reserva
    @PostMapping
    public ResponseEntity<ReservasDTO> createReserva(@RequestBody ReservasDTO reserva) {
        // Lógica para crear una nueva reserva
        return new ResponseEntity<>(iReservasService.createReserva(reserva), HttpStatus.CREATED);
    }

    // Servicio para actualizar una reserva existente
    @PutMapping("/{reservaId}")
    public ResponseEntity<ReservasDTO> updateReserva(@PathVariable Long reservaId, @RequestBody ReservasDTO reserva) {
        // Lógica para actualizar la reserva por ID
        return new ResponseEntity<>(iReservasService.updateReserva(reservaId, reserva), HttpStatus.OK);
    }

    // Servicio para eliminar una reserva por ID
    @DeleteMapping("/{reservaId}")
    public ResponseEntity<Void> deleteReserva(@PathVariable Long reservaId) {
        // Lógica para eliminar la reserva por ID
        iReservasService.deleteReserva(reservaId);
        return new ResponseEntity<>( HttpStatus.NO_CONTENT);
    }


}

