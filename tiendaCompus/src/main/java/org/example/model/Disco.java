package org.example.model;

public class Disco {
    private String marca;
    private double gbCapacidad;

    public Disco(String marca, double gbCapacidad) {
        this.setMarca(marca);
        this.setGbCapacidad(gbCapacidad);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getGbCapacidad() {
        return gbCapacidad;
    }

    public void setGbCapacidad(double gbCapacidad) {
        this.gbCapacidad = gbCapacidad;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Disco{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", gbCapacidad=").append(gbCapacidad);
        sb.append('}');
        return sb.toString();
    }
}
