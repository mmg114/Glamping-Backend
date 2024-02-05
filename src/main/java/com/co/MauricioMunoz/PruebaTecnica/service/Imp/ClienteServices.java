package com.co.MauricioMunoz.PruebaTecnica.service.Imp;

import com.co.MauricioMunoz.PruebaTecnica.dto.request.ClienteDTORequest;
import com.co.MauricioMunoz.PruebaTecnica.dto.response.ClienteDTOResponse;
import com.co.MauricioMunoz.PruebaTecnica.model.Cliente;
import com.co.MauricioMunoz.PruebaTecnica.repository.ClienteRepository;
import com.co.MauricioMunoz.PruebaTecnica.service.IClienteServices;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Scope("singleton")
@Service
public class ClienteServices implements IClienteServices {


    public ClienteServices(ClienteRepository clienteRepository){

    }

    @Override
    public ClienteDTOResponse create(ClienteDTORequest clienteDTORequest) {
        return null;
    }

    @Override
    public void delete(UUID clienteId) {

    }

    @Override
    public ClienteDTOResponse update(UUID clienteId, ClienteDTORequest clienteDTORequest) {
        return null;
    }

    @Override
    public ClienteDTOResponse buscar(UUID clienteId) {
        return null;
    }
}
