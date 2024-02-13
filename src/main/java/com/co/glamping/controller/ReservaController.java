package com.co.glamping.controller;

import com.co.glamping.dto.response.ReservasDTOResponse;
import com.co.glamping.service.IReservasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/reserva")
public class ReservaController {


    @Autowired
    IReservasService iReservasService;


    @GetMapping("/dashboard")
    public ResponseEntity<List<ReservasDTOResponse>> getUser() {
        return new ResponseEntity<>(iReservasService.reservasDashboard(), HttpStatus.OK);
    }
}
