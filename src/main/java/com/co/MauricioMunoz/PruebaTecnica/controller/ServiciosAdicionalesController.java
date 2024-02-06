package com.co.MauricioMunoz.PruebaTecnica.controller;

import com.co.MauricioMunoz.PruebaTecnica.model.ServiciosAdicionales;
import com.co.MauricioMunoz.PruebaTecnica.service.IServiciosAdicionalesServices;
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
    public ResponseEntity<List<ServiciosAdicionales>> obtenerTodosLosServiciosAdicionales() {
        List<ServiciosAdicionales> serviciosAdicionales = serviciosAdicionalesServices.obtenerTodosLosServiciosAdicionales();
        return ResponseEntity.ok(serviciosAdicionales);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ServiciosAdicionales> obtenerServicioAdicionalPorId(@PathVariable Long id) {
        ServiciosAdicionales servicioAdicional = serviciosAdicionalesServices.obtenerServicioAdicionalPorId(id);
        return servicioAdicional != null
                ? ResponseEntity.ok(servicioAdicional)
                : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<ServiciosAdicionales> agregarServicioAdicional(@RequestBody ServiciosAdicionales servicioAdicional) {
        ServiciosAdicionales nuevoServicioAdicional = serviciosAdicionalesServices.agregarServicioAdicional(servicioAdicional);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoServicioAdicional);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ServiciosAdicionales> actualizarServicioAdicional(@PathVariable Long id, @RequestBody ServiciosAdicionales servicioAdicional) {
        ServiciosAdicionales servicioActualizado = serviciosAdicionalesServices.actualizarServicioAdicional(id, servicioAdicional);
        return servicioActualizado != null
                ? ResponseEntity.ok(servicioActualizado)
                : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarServicioAdicional(@PathVariable Long id) {
        serviciosAdicionalesServices.eliminarServicioAdicional(id);
        return ResponseEntity.noContent().build();
    }
}


