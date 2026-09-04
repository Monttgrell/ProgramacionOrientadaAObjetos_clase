package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Inventario {

    private List<Computador> productos;

    public Inventario(){
        productos=new ArrayList<>();
    }

    public List<Computador> getProductos() {
        return productos;
    }

    public void setProductos(Computador computador) throws Exception {
        this.productos.add(computador);
    }

    public Computador buscarxserie(int serie){
        if (productos.getSerie()==Serie){
            // TODO ver que es lo que sigue acá
        }
    }
}
