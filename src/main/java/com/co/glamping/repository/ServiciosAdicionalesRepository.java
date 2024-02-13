package com.co.glamping.repository;


import com.co.glamping.model.ServiciosAdicionales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiciosAdicionalesRepository extends JpaRepository<ServiciosAdicionales, Long> {

    List<ServiciosAdicionales> findByNombreServicio(String nombreServicio);
}
