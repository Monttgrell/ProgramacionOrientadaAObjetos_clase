package org.example.model;

public class Ram {
    private String marca;
    private String modelo;
    private TipoRam tipoRam;
    private int capacidad;

    public Ram(String marca, String modelo, TipoRam tipoRam, int capacidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoRam = tipoRam;
        this.capacidad = capacidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public TipoRam getTipoRam() {
        return tipoRam;
    }

    public void setTipoRam(TipoRam tipoRam) {
        this.tipoRam = tipoRam;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ram{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", tipoRam=").append(tipoRam);
        sb.append(", capacidad=").append(capacidad);
        sb.append('}');
        return sb.toString();
    }
}
