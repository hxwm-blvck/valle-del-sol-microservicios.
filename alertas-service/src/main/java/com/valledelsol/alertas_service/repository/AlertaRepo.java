package com.valledelsol.alertas_service.repository;


import com.valledelsol.alertas_service.model.Alerta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlertaRepo extends JpaRepository<Alerta, Long> {
}
