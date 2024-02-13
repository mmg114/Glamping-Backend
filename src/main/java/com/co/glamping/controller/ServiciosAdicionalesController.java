<<<<<<< HEAD:src/main/java/com/co/MauricioMunoz/PruebaTecnica/controller/ServiciosAdicionalesController.java
package com.co.MauricioMunoz.PruebaTecnica.controller;

import com.co.MauricioMunoz.PruebaTecnica.dto.response.ServiciosAdicionalesDTOResponse;
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
    public ResponseEntity<ServiciosAdicionalesDTOResponse> obtenerServicioAdicionalPorId(@PathVariable Long id) {
        ServiciosAdicionalesDTOResponse servicioAdicional = serviciosAdicionalesServices.obtenerServicioAdicionalPorId(id);
        return ResponseEntity.ok(servicioAdicional);

    }

    @PostMapping
    public ResponseEntity<ServiciosAdicionales> agregarServicioAdicional(@RequestBody ServiciosAdicionales servicioAdicional) {
        ServiciosAdicionales nuevoServicioAdicional = serviciosAdicionalesServices.agregarServicioAdicional(servicioAdicional);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoServicioAdicional);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ServiciosAdicionales> actualizarServicioAdicional(@PathVariable Long id, @RequestBody ServiciosAdicionales servicioAdicional) {
        ServiciosAdicionales servicioActualizado = serviciosAdicionalesServices.actualizarServicioAdicional(id, servicioAdicional);
        return ResponseEntity.ok(servicioActualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarServicioAdicional(@PathVariable Long id) {
        serviciosAdicionalesServices.eliminarServicioAdicional(id);
        return ResponseEntity.noContent().build();
    }
}


=======
package com.co.glamping.controller;

public class ServiciosAdicionalesController {
}
>>>>>>> Dev:src/main/java/com/co/glamping/controller/ServiciosAdicionalesController.java
