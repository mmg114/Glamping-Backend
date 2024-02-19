package com.co.glamping.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;


@Entity
@Data
@Builder
@Table(name = "tipo_estado")
public class TipoEstado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "estado_id")
    private Long estadoId;
}
