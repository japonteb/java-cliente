package com.apirest.cliente.aplicacion.manejador;

import com.apirest.cliente.aplicacion.ComandoCliente;
import com.apirest.cliente.aplicacion.fabrica.FabricaCliente;
import com.apirest.cliente.dominio.modelo.Cliente;
import com.apirest.cliente.dominio.servicio.ServicioCrearCliente;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class ManejadorCrearCliente  {

    private final FabricaCliente fabricaCliente;
    private final ServicioCrearCliente servicioCrearCliente;

    public ManejadorCrearCliente(FabricaCliente fabricaCliente, ServicioCrearCliente servicioCrearCliente) {
        this.fabricaCliente = fabricaCliente;
        this.servicioCrearCliente = servicioCrearCliente;
    }

    public Mono<Cliente> ejecutar(ComandoCliente comandoCliente) throws Exception {
        Cliente cliente = this.fabricaCliente.crear(comandoCliente);
        return this.servicioCrearCliente.ejecutar(cliente);
    }
}