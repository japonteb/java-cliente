package com.apirest.cliente.dominio.servicio;

import com.apirest.cliente.dominio.puerto.repositorio.RepositorioCliente;

public class ServicioEliminarCliente {

    private final RepositorioCliente repositorioCliente;

    public ServicioEliminarCliente(RepositorioCliente repositorioCliente) {
        this.repositorioCliente = repositorioCliente;
    }

    public void ejecutar(Long documentoIdentidad) {
        this.repositorioCliente.eliminar(documentoIdentidad);
    }
}