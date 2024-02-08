package com.co.glamping.service.Imp.model;

import jakarta.persistence.*;


@Entity
@Table(name = "tipo_estado")
public class TipoEstado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "estado_id")
    private int estadoId;
}
