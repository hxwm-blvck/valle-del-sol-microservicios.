package com.valledelsol.reportes_service.factory;

public class ReporteFactory {

    public static Reporte crearReporte(Double latitud, Double longitud, String tipo, String descripcion){
        Reporte reporte = new Reporte();
        reporte.setLatitud(latitud);
        reporte.setLongitud(longitud);
        reporte.setTipo(tipo);
        reporte.setDescripcion(descripcion);

        switch (tipo.toUpperCase()){
            case "Brigadista"
        }
    }
}
