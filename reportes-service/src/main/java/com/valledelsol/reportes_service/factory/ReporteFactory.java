package com.valledelsol.reportes_service.factory;

import com.valledelsol.reportes_service.model.Reporte;

public class ReporteFactory {

    public static Reporte crearReporte(Double latitud, Double longitud, String tipo, String descripcion){
        Reporte reporte = new Reporte();
        reporte.setLatitud(latitud);
        reporte.setLongitud(longitud);
        reporte.setTipo(tipo);
        reporte.setDescripcion(descripcion);

        switch (tipo.toUpperCase()){
            case "BRIGADISTA":
            case "BOMBEROS":
                reporte.setPrioridad("ALTA");
                reporte.setEstado("VERIFICADO"); // Confiamos en los profesionales
                break;
            case "VECINO":
                reporte.setPrioridad("MEDIA");
                reporte.setEstado("PENDIENTE_VALIDACION"); // Requiere que alguien lo confirme
                break;
            case "SENSOR":
                reporte.setPrioridad("CRITICA");
                reporte.setEstado("VERIFICADO_AUTOMATICO"); // Las máquinas no suelen mentir
                break;
            default:
                reporte.setPrioridad("BAJA");
                reporte.setEstado("NO_CLASIFICADO");
                break;
        }
        return reporte;
    }
}
