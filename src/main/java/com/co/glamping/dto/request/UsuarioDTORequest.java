package com.co.glamping.dto.request;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UsuarioDTORequest {

    private String mail;
    private String nombreUsuario;
    private String contrasena;
    private Long rolId;
    private Long sucursalId;
}
