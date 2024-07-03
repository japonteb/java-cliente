package com.apirest.cliente.dominio.modelo;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Cliente {
    @NotNull
    @Size(min = 0, max = 999999999)
    @Id
    private Long documentoIdentidad;
    @NotNull
    private ClienteTipoDocumentoEnum tipoDocumento;
    @NotNull
    private String nombreCompleto;
    @NotNull
    private LocalDate fechaNacimiento;
}
