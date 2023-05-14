package Parking.Entidades;

import java.time.LocalDateTime;

public class Carro {

    private String licencia;
    private String color;
    private LocalDateTime fechaTiempo;

    public Carro(String licencia, String color) {
        this.licencia = licencia;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public LocalDateTime getFechaTiempo() {
        return fechaTiempo;
    }

    public void setFechaTiempo(LocalDateTime fechaTiempo) {
        this.fechaTiempo = fechaTiempo;
    }
}
