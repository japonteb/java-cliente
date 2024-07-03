package com.apirest.cliente.dominio.servicio;

import com.apirest.cliente.dominio.modelo.Cliente;
import com.apirest.cliente.dominio.puerto.repositorio.RepositorioCliente;
import reactor.core.publisher.Mono;

public class ServicioCrearCliente {
    private static final String EL_CLIENTE_YA_EXISTE_EN_EL_SISTEMA = "El cliente ya existe en el sistema";

    private final RepositorioCliente repositorioCliente;

    public ServicioCrearCliente(RepositorioCliente repositorioCliente) {
        this.repositorioCliente = repositorioCliente;
    }

    public Mono<Cliente> ejecutar(Cliente cliente) throws Exception {
        validarExistenciaPrevia(cliente);
        return this.repositorioCliente.crear(cliente);
    }

    private void validarExistenciaPrevia(Cliente cliente) throws Exception {
        boolean existe = this.repositorioCliente.existePorDocumentoDeIdentidad(cliente.getDocumentoIdentidad());
        if(existe) {
            throw new Exception(EL_CLIENTE_YA_EXISTE_EN_EL_SISTEMA);
        }
    }
}
