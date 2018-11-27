package com.example.itlm.app1.ForecastModels;

public class headerForecast {

    String Fecha, Pronostico, Temperatura, Icono, ProbabLluvia, VelViento, Humedad;

    public headerForecast() {
    }

    public headerForecast(String fecha, String pronostico, String temperatura, String icono, String probabLluvia, String velViento, String humedad) {
        Fecha = fecha;
        Pronostico = pronostico;
        Temperatura = temperatura;
        Icono = icono;
        ProbabLluvia = probabLluvia;
        VelViento = velViento;
        Humedad = humedad;
    }


    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public String getPronostico() {
        return Pronostico;
    }

    public void setPronostico(String pronostico) {
        Pronostico = pronostico;
    }

    public String getTemperatura() {
        return Temperatura;
    }

    public void setTemperatura(String temperatura) {
        Temperatura = temperatura;
    }

    public String getIcono() {
        return Icono;
    }

    public void setIcono(String icono) {
        Icono = icono;
    }

    public String getProbabLluvia() {
        return ProbabLluvia;
    }

    public void setProbabLluvia(String probabLluvia) {
        ProbabLluvia = probabLluvia;
    }

    public String getVelViento() {
        return VelViento;
    }

    public void setVelViento(String velViento) {
        VelViento = velViento;
    }

    public String getHumedad() {
        return Humedad;
    }

    public void setHumedad(String humedad) {
        Humedad = humedad;
    }
}
