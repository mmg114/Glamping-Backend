package com.co.glamping.repository;

import com.co.glamping.service.Imp.model.Reserva;
import com.co.glamping.service.Imp.model.enums.Estados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;


public interface ReservasRepository extends JpaRepository<Reserva,Long > {

       @Query("SELECT r FROM Reservas r WHERE r.estado.nombre IN :estados and r.fechaInicial :fecha ")
       List<Reserva> findByEstadoAndFechaInicio(@Param("estados") List<Estados> estados, @Param("fecha") LocalDate fecha);
}
