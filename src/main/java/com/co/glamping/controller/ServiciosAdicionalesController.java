package com.co.glamping.controller;

import com.co.glamping.dto.request.ServiciosAdicionalesDTORequest;
import com.co.glamping.dto.response.ServiciosAdicionalesDTOResponse;
import com.co.glamping.model.ServiciosAdicionales;
import com.co.glamping.service.IServiciosAdicionalesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/servicios-adicionales")
public class ServiciosAdicionalesController {

    @Autowired
    private IServiciosAdicionalesServices serviciosAdicionalesServices;

    @GetMapping
    public ResponseEntity<List<ServiciosAdicionalesDTOResponse>> obtenerTodosLosServiciosAdicionales() {
        List<ServiciosAdicionalesDTOResponse> serviciosAdicionales = serviciosAdicionalesServices.obtenerTodosLosServiciosAdicionalesDTO();
        return ResponseEntity.ok(serviciosAdicionales);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ServiciosAdicionalesDTOResponse> obtenerServicioAdicionalPorId(@PathVariable Long id) {
        ServiciosAdicionalesDTOResponse servicioAdicional = serviciosAdicionalesServices.obtenerServicioAdicionalDTOporId(id);
        return ResponseEntity.ok(servicioAdicional);
    }

    @PostMapping
    public ResponseEntity<ServiciosAdicionalesDTOResponse> agregarServicioAdicional(@RequestBody ServiciosAdicionalesDTORequest serviciosAdicionalesDTORequest) {
        ServiciosAdicionalesDTOResponse nuevoServicioAdicional = serviciosAdicionalesServices.agregarServicioAdicional(serviciosAdicionalesDTORequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoServicioAdicional);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ServiciosAdicionalesDTOResponse> actualizarServicioAdicional(@PathVariable Long id, @RequestBody ServiciosAdicionalesDTORequest serviciosAdicionalesDTORequest) {
        ServiciosAdicionalesDTOResponse servicioActualizado = serviciosAdicionalesServices.actualizarServicioAdicional(id, serviciosAdicionalesDTORequest);
        return ResponseEntity.ok(servicioActualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarServicioAdicional(@PathVariable Long id) {
        serviciosAdicionalesServices.eliminarServicioAdicional(id);
        return ResponseEntity.noContent().build();
    }
}
