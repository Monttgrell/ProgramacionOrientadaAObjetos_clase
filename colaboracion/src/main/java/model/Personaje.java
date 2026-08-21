package model;

public class Personaje {
    private String nombre;
    private int vida;
    private Raza raza;
    private int nivel;
    private Arma arma;
    private Skin skin;

    // Constructor

    public Personaje(String nombre, Raza raza, Skin skin) throws Exception { //La mayuscula es la class y la minuscula la variable
        this.setNombre(nombre);
        this.setRaza(raza);
        // TODO AGREGAR ARMA
        nivel = 1; // como no lo pide no se agrega this
        vida = 100;
        this.setSkin();
    }

    // getter setter
    public void setNombre(String nombre) throws Exception {
        if (!nombre.isBlank() && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            throw new Exception(("Debe agregar el nombre del personaje"));

        }

    }

    public String getNombre() {
        return this.nombre;
    }

    public void setRaza(Raza raza) throws Exception {
        if (raza != null) {
            this.raza = raza;
        } else {
            throw new Exception("La raza no puede ser null");
        }
    }

    // GENERAR METODO PARA ASIGNAR ARMA

    public void setArma(Arma arma) {
        if (arma != null) { // se valida el null
            this.arma = arma;
        }
    }
    public Arma getArma(){ //para el getArma retorna Arma porque retorna el objeto completo
        return this.arma;
    }

    public void setSkin() throws Exception {
        if (skin != null) {
        } else {
            throw new Exception("Debe agregar Skin");
        }
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", vida=" + vida +
                ", raza=" + raza +
                ", nivel=" + nivel +
                ", arma=" + arma +
                ", skin=" + skin +
                '}';
    }
}


