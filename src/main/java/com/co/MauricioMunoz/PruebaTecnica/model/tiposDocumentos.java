package com.co.MauricioMunoz.PruebaTecnica.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="TIPO_DOCUMENTO")
public class tiposDocumentos {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2")
    @Column(name = "ID_TIPO_DOCUMENTO", columnDefinition = "VARCHAR(255)")
    private UUID id;

    @NotBlank
    @NotNull
    @NotEmpty
    @Column(name = "NAME", length = 100, nullable = false)
    private String name;


}
