package com.apirest.cliente.aplicacion.fabrica;

import com.apirest.cliente.aplicacion.ComandoCliente;
import com.apirest.cliente.dominio.modelo.Cliente;
import org.springframework.stereotype.Component;

@Component
public class FabricaCliente {

    public Cliente crear(ComandoCliente comandoCliente) {
        return new Cliente(comandoCliente.getDocumentoIdentidad(), comandoCliente.getTipoDocumento(),
                comandoCliente.getNombreCompleto(), comandoCliente.getFechaNacimiento());
    }
}
