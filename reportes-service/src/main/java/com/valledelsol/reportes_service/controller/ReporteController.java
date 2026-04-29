package com.valledelsol.reportes_service.controller;


import com.valledelsol.reportes_service.model.Reporte;
import com.valledelsol.reportes_service.service.ReporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.valledelsol.reportes_service.service.ReporteService;

import java.util.List;

@RestController // Le dice a Spring que esta clase responderá peticiones web (API REST)
@RequestMapping("/api/reportes") // La URL base para entrar a este "restaurante"
public class ReporteController {

    @Autowired
    private ReporteService service;

    @PostMapping
    public Reporte crearNuevoReporte(@RequestBody Reporte request){
        return service.registrarReporte(
                request.getLatitud(),
                request.getLongitud(),
                request.getDescripcion(),
                request.getTipo()
        );
    }
    @GetMapping
    public List<Reporte> verTodosLosReportes(){
        return service.obtenerTodosLosReportes();
    }
}
