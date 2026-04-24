package com.valledelsol.reportes_service.repository;

import com.valledelsol.reportes_service.model.Reporte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReporteRepository  extends JpaRepository<Reporte, Long> {
}
