package model;

public class Arma {
    private  String nombre;
    private int damage;

    //constructor
    public Arma(String nombre, int damage) throws Exception {
        this.setNombre(nombre);
        this.setDamage(damage);
    }

    public String getNombre() throws Exception {
        this.nombre=nombre;
        return this.nombre;}
    public void setNombre(String nombre) throws Exception {
        if (!nombre.isEmpty() && !nombre.isBlank()) {
            this.nombre = nombre;
        } else {
            throw new Exception("Debe agregar el nombre");
        }
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}

