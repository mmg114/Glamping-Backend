package com.co.MauricioMunoz.PruebaTecnica.service;

import com.co.MauricioMunoz.PruebaTecnica.dto.request.ClienteDTORequest;
import com.co.MauricioMunoz.PruebaTecnica.dto.response.ClienteDTOResponse;

import java.util.UUID;

public interface IClienteServices {

    ClienteDTOResponse create(ClienteDTORequest clienteDTORequest);

    void delete(UUID clienteId);

    ClienteDTOResponse update(UUID clienteId, ClienteDTORequest clienteDTORequest);

    ClienteDTOResponse buscar(UUID clienteId);
}
