package com.apirest.cliente.dominio.modelo;

public enum ClienteTipoDocumentoEnum {
    CEDULA("Cedula"),
    PASAPORTE("Pasaporte");

    private String tipoDocumento;

    ClienteTipoDocumentoEnum(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }
}
