package com.co.MauricioMunoz.PruebaTecnica.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CLIENTE")
public class Cliente {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2")
    @Column(name = "ID_CLIENTE", length = 50, nullable = false)
    private UUID id;

    @NotBlank
    @NotNull
    @NotEmpty
    @Column(name = "NOMBRE", length = 100, nullable = false)
    private String nombre;

    @NotBlank
    @NotNull
    @NotEmpty
    @Column(name = "APELLIDO", length = 100, nullable = false)
    private String apellido;

    @NotBlank
    @NotNull
    @NotEmpty
    @Column(name = "DOCUMENTO", length = 20, nullable = false)
    private String documento;

    @Column(name = "FECHA_NACIMIENTO")
    @Temporal(TemporalType.DATE)
    private LocalDate fechaNacimiento;

    @Column(name = "EMAIL", length = 50, nullable = false)
    private String email;

    @Column(name = "TIPO_DOCUMENTO", length = 50, nullable = false )
    private String tipoDcumento;

    @Column(name = "TELEFONO", length = 20, nullable = false)
    private String telefono;

}
