package model;

public class Persona {
    // todos los atributos son privados

    private String nombre; // esta es una clase porque tiene  la primera letra en mayúscula
    private String apellido;
    private int edad; // va en minuscula porque es una tipo de dato primitivos
    private double peso; // souble es como el float pero tiene formato ya hecho

    // constructor
    public Persona(){

    }
    public void setNombre(String nombre) throws Exception { // es el metodo publico para setear el nombre
     if (!nombre.isBlank() && !nombre.isEmpty()){ // metodos para que no esten vacíos
         this.nombre=nombre;} // buena práctica: ponerle el mismo nombre que el atributo
                            /* cuando uno coloca this se refiere a los atributos que está fuera del metodo (función)
                            "abre la burbuja de la función*/
     else {
            throw new Exception("El nombre no puede estar vacío");
     }

    }

    public String getNombre() { // es el metodo para obtener el nombre
        return this.nombre;
    }
}
