package com.co.glamping.service.Imp.model.enums;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public enum Rol {
    ADMIN,
    USER
}