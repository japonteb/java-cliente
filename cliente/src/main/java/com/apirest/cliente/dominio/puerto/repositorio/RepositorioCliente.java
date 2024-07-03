package com.apirest.cliente.dominio.puerto.repositorio;

import com.apirest.cliente.dominio.modelo.Cliente;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface RepositorioCliente extends ReactiveMongoRepository<Cliente, Integer> {
    /**
     * Permite crear un cliente
     * @param cliente
     * @return el id del cliente generado
     */
    Mono<Cliente> crear(Cliente cliente);

    /**
     * Permite validar si existe un cliente con el mismo número de identificación
     * @return si existe o no
     */
    boolean existePorDocumentoDeIdentidad(Long documentoIdentidad);

    /**
     * Permite eliminar un cliente
     * @param documentoIdentidad
     */
    void eliminar(Long documentoIdentidad);
}
