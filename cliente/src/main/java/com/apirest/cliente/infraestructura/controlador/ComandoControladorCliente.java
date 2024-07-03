package com.apirest.cliente.infraestructura.controlador;

import com.apirest.cliente.aplicacion.ComandoCliente;
import com.apirest.cliente.aplicacion.manejador.ManejadorCrearCliente;
import com.apirest.cliente.aplicacion.manejador.ManejadorEliminarCliente;
import com.apirest.cliente.dominio.modelo.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RequestMapping("/cliente")
public class ComandoControladorCliente {

    private final ManejadorCrearCliente manejadorCrearCliente;
    private final ManejadorEliminarCliente manejadorEliminarCliente;

    @Autowired
    public ComandoControladorCliente(ManejadorCrearCliente manejadorCrearCliente,
                                     ManejadorEliminarCliente manejadorEliminarCliente) {
        this.manejadorCrearCliente = manejadorCrearCliente;
        this.manejadorEliminarCliente = manejadorEliminarCliente;
    }

    @PostMapping
    public Mono<Cliente> crear(@RequestBody ComandoCliente comandoCliente) throws Exception {
        return manejadorCrearCliente.ejecutar(comandoCliente);
    }

    @DeleteMapping(value="/{id}")
    public void eliminar(@PathVariable Long documentoIdentidad) {
        manejadorEliminarCliente.ejecutar(documentoIdentidad);
    }
}
