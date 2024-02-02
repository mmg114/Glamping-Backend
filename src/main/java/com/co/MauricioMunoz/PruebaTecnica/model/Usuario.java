package com.co.MauricioMunoz.PruebaTecnica.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuarios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuario_id")
    private Long usuarioId;

    @Column(name = "nombre_usuario", length = 50)
    private String nombreUsuario;

    @Column(name = "contrasena", length = 255)
    private String contrasena;

    @Column(name = "rol_id")
    private Long rolId;

    @Column(name = "sucursal_id")
    private Long sucursalId;
}
