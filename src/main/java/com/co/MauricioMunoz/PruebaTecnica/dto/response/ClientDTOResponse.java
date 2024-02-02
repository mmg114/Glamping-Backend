package com.co.MauricioMunoz.PruebaTecnica.dto.response;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;
@Data
@Builder
public class ClientDTOResponse {

    private UUID id;
    private LocalDate created;
    private LocalDate modified;
    private LocalDate lastLogin;
    private UUID token;
    private boolean isActive;
}
