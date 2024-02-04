package com.co.glamping.repository;

import com.co.glamping.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ReservasRepository extends JpaRepository<Reserva,Long > {

    //   @Query("SELECT r FROM Reservas r WHERE r.estado.nombre IN :estados and r.fechaInicial :fecha ")
 //      List<Reservas> findByEstadoAndFechaInicio(@Param("estados") List<String> estados,@Param("fecha") LocalDate fecha);
}
