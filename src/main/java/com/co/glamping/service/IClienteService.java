package com.co.glamping.service;

import com.co.glamping.dto.ClienteDTO;

public interface IClienteService {

    ClienteDTO getCliente(Long clienteId);

    ClienteDTO create(ClienteDTO clienteDTO);

}
