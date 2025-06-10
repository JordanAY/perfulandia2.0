package com.vededores.dto;

import lombok.Data;

@Data
public class VendedorDTO {
    private Integer idVendedor;
    private Integer idUsuario;
    private String nombreCompleto;
    private Integer rut;
    private String areaVentas;
    
}
