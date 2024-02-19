package com.co.glamping.model.enums;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;



public enum Rol {
    ADMIN(1, "Administrador"),
    USUARIO(2, "Usuario");

    private final Integer id;
    private final String nombre;

    Rol(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
}