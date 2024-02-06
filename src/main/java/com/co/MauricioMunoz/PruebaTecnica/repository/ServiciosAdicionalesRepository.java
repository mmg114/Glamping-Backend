package com.co.MauricioMunoz.PruebaTecnica.repository;

import com.co.MauricioMunoz.PruebaTecnica.model.ServiciosAdicionales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiciosAdicionalesRepository extends JpaRepository<ServiciosAdicionales, Long> {

    List<ServiciosAdicionales> findByNombreServicio(String nombreServicio);
}
