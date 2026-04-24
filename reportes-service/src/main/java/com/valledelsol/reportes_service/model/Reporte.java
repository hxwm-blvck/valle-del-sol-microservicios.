package com.valledelsol.reportes_service.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table (name = "reportes")
@Data
public class Reporte {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private Double latitud;
    private Double longitud;
    private String descripción;

    private String tipo;
    private String prioridad;
    private String estado;

}
