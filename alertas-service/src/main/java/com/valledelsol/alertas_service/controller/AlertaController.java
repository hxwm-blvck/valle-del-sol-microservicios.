package com.valledelsol.alertas_service.controller;


import com.valledelsol.alertas_service.model.Alerta;
import com.valledelsol.alertas_service.service.AlertaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/alertas")
public class AlertaController {

    @Autowired
    private AlertaService alertaService;

    @GetMapping
    public List<Alerta> obtenerAlerta(){
        return alertaService.listarTodos();
    }
}
