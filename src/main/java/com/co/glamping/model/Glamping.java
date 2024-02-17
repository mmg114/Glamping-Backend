package com.co.glamping.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "glamping")
public class Glamping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "glamping_id")
    private Long glampingId;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "caracteristicas", columnDefinition = "json")
    private String caracteristicas;


}