package model;

public class Skin {
    private String nombre;
    private int valor;

    public Skin (String nombre, int valor){
        this.setNombre(nombre); // TODO VALIDACIONES
        this.setValor(valor); // TODO VALIDACIONES
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
