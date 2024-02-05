package com.co.MauricioMunoz.PruebaTecnica.repository;

import com.co.MauricioMunoz.PruebaTecnica.model.Client;
import com.co.MauricioMunoz.PruebaTecnica.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClienteRepository extends JpaRepository<Cliente, UUID> {
}
