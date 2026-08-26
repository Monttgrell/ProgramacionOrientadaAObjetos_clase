package model;

public class Arma {
    private String nombre;
    private int damage;

    public Arma(String nombre, int damage) throws Exception {
        this.setNombre(nombre);
        this.setDamage(damage);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if (!nombre.isEmpty() && !nombre.isBlank()) {
            this.nombre = nombre;
        }
        else {
            throw new Exception("Debe agregar nombre al arma");
        }
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) throws Exception {
        if (damage>0) {
            this.damage = damage;
        }else {
            throw new Exception("El daño debe ser mayor que cero");
        }
    }
}
