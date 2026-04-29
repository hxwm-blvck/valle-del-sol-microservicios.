package com.valledelsol.alertas_service.service;

import com.valledelsol.alertas_service.model.Alerta;
import com.valledelsol.alertas_service.repository.AlertaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlertaService {

    @Autowired
    private AlertaRepo alertaRepository;


    public List<Alerta> listarTodos(){
        return alertaRepository.findAll();
    }
}
