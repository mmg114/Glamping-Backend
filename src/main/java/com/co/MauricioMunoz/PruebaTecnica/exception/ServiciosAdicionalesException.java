package com.co.MauricioMunoz.PruebaTecnica.exception;

public class ServiciosAdicionalesException extends RuntimeException {

    public ServiciosAdicionalesException(Long idServicio) {
        super("Servicio adicional no encontrado con ID: " + idServicio);
    }
}
