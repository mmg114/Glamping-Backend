package com.co.glamping.model;

import jakarta.persistence.*;

@Entity
@Table(name = "glamping")
public class Glamping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "glamping_id")
    private int glampingId;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "caracteristicas", columnDefinition = "json")
    private String caracteristicas;

    // Getters and setters
}