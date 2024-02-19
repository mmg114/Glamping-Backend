package com.co.glamping.controller;

import com.co.glamping.dto.request.UsuarioDTORequest;
import com.co.glamping.dto.response.UsuarioDTOResponce;
import com.co.glamping.service.Imp.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/client")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<UsuarioDTOResponce> createUser(@RequestBody UsuarioDTORequest usuarioDTORequest) {
        usuarioService.recuperarContrasena(usuarioDTORequest);
        return new ResponseEntity<>(null, HttpStatus.ACCEPTED);
    }
}
