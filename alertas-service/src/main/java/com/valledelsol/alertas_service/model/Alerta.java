package com.valledelsol.alertas_service.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "alertas")
public class Alerta {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idAlerta;
    private String descripcion;
    private String tipoAlerta;
}
