package com.apirest.cliente.aplicacion.manejador;

import com.apirest.cliente.dominio.servicio.ServicioEliminarCliente;
import org.springframework.stereotype.Component;

@Component
public class ManejadorEliminarCliente {

    private final ServicioEliminarCliente servicioEliminarCliente;

    public ManejadorEliminarCliente(ServicioEliminarCliente servicioEliminarCliente) {
        this.servicioEliminarCliente = servicioEliminarCliente;
    }

    public void ejecutar(Long documentoIdentidad) {
        this.servicioEliminarCliente.ejecutar(documentoIdentidad);
    }
}
