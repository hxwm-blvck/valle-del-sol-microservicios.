package com.valledelsol.reportes_service.service;


import com.valledelsol.reportes_service.factory.ReporteFactory;
import com.valledelsol.reportes_service.model.Reporte;
import com.valledelsol.reportes_service.repository.ReporteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReporteService {
    @Autowired
    private ReporteRepository repository;

    public Reporte registrarReporte(Double latitud, Double longitud, String descripcion, String tipo){
        Reporte nuevoReporte = ReporteFactory.crearReporte(latitud, longitud, tipo, descripcion);
        return repository.save(nuevoReporte);
    }
    public List<Reporte> obtenerTodosLosReportes(){
        return repository.findAll();
    }
}
