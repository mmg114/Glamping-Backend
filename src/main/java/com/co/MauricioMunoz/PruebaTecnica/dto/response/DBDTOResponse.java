package com.co.MauricioMunoz.PruebaTecnica.dto.response;

import lombok.Builder;
import lombok.Data;
import java.util.Date;
import java.util.UUID;


@Data
@Builder
public class DBDTOResponse {

    private UUID id;
    private Date created;
    private Date modified;
    private String estado; // Estado de la reserva (por ejemplo, "pagada", "abonada", etc.)
    private boolean isActive;
}

