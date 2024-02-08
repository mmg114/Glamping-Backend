package com.co.glamping.service.Imp.model;
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

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cliente_id")
    private int clienteId;

    @NotBlank
    @NotNull
    @NotEmpty
    @Column(name = "nombre")
    private String nombre;

    @NotBlank
    @NotNull
    @NotEmpty
    @Column(name = "apellido")
    private String apellido;

    @NotBlank
    @NotNull
    @NotEmpty
    @Column(name = "documento")
    private String documento;

    @NotBlank
    @NotNull
    @NotEmpty
    @Column(name = "tipo_documento")
    private String tipoDocumento;

    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;

    @NotBlank
    @NotNull
    @NotEmpty
    @Column(name = "correo_electronico")
    private String correoElectronico;

}
