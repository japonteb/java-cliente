package com.apirest.cliente.aplicacion;

import com.apirest.cliente.dominio.modelo.ClienteTipoDocumentoEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoCliente {
    private Long documentoIdentidad;
    private ClienteTipoDocumentoEnum tipoDocumento;
    private String nombreCompleto;
    private LocalDate fechaNacimiento;
}