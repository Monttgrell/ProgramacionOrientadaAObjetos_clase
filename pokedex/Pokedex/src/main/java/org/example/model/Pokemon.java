package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Pokemon {
    private String nombre;
    private Tipo tipo;
    private int nivel;
    private List<Evolucion> evoluciones = new ArrayList<>();

    public Pokemon(String nombre, Tipo tipo, int nivel, Evolucion evoluciones) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
        this.evoluciones.add(evoluciones); // acá se agrega a la lista evoluciones, una lista evolución

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public List<Evolucion> getEvoluciones() {
        return evoluciones;
    }

    public void setEvoluciones(List<Evolucion> evoluciones) {
        this.evoluciones = evoluciones;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pokemon{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", tipo=").append(tipo);
        sb.append(", nivel=").append(nivel);
        sb.append(", evoluciones=").append(evoluciones);
        sb.append('}');
        return sb.toString();
    }
}
