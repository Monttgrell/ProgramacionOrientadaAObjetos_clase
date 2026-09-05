package org.example.model;

import java.util.List;

public class Evolucion {
    private String nombre_evo;

    public String getNombre_evo() {
        return this.nombre_evo;
    }

    public void setNombre_evo(String nombre_evo) {
        this.nombre_evo = nombre_evo;
    }

    public void agregar_evo(String nombre_evo,List <Evolucion> evoluciones){
        //todo validadores
        evoluciones.add(nombre_evo);
    }
}
