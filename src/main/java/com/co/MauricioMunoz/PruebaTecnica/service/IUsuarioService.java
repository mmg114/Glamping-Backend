package com.co.MauricioMunoz.PruebaTecnica.service;

import com.co.MauricioMunoz.PruebaTecnica.dto.request.UsuarioDTORequest;

public interface IUsuarioService {

    public void recuperarContrasena(UsuarioDTORequest usuarioDTORequest);
}
