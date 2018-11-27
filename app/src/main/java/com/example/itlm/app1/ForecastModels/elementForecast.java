package com.example.itlm.app1.ForecastModels;

public class elementForecast {
    String fecha, icono, temperatura , pronostico, probabLluvia;

    //alt + insert crear constructor, setters & getters

    public elementForecast() {
    }

    public elementForecast(String fecha, String icono, String temperatura, String pronostico, String probabLluvia) {
        this.fecha = fecha;
        this.icono = icono;
        this.temperatura = temperatura;
        this.pronostico = pronostico;
        this.probabLluvia = probabLluvia;
    }


    public String getFecha() {
        return fecha;
    }

    public void setFecha(String dia) {
        this.fecha = fecha;
    }

    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getPronostico() {
        return pronostico;
    }

    public void setPronostico(String pronostico) {
        this.pronostico = pronostico;
    }

    public String getProbabLluvia() {
        return probabLluvia;
    }

    public void setProbabLluvia(String probabLluvia) {
        this.probabLluvia = probabLluvia;
    }
}
