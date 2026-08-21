package model;

public class Alumno {
    private String nombre;
    private String apellido;
    private int edad;
    private int salud;

    // CONSTRUCTOR VACIO
    public Alumno(){
        this.salud=100;
    }

    public Alumno(String nombre, String apellido, int edad) throws Exception {
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setEdad(edad);
        this.salud=100;
    }

    // GETTER/SETTER
// nombre  apellido string
    public void setNombre(String nombre) throws Exception {
        if (!nombre.isBlank() && !nombre.isEmpty()) {
            this.nombre = nombre;
        }else {
            throw new Exception("Debe agregar el nombre");
        }
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setApellido(String apellido) throws Exception {
        if (!apellido.isBlank() && !apellido.isEmpty()) {
            this.apellido = apellido;
        }else {
            throw new Exception("Debe agregar el apellido");
        }
    }

    public String getApellido(){
        return this.apellido;
    }

// int
    public void setEdad(int edad) throws Exception {
        if(edad>18) {
            this.edad = edad;
        }
        else {
            throw new Exception("Ingrese edad correcta");

        }
    }

    public int getEdad() {
        return edad;
    }

    public int getSalud(){
        return this.salud;
    }

    @Override
    public String toString() {
        return this.nombre + " " + this.apellido + " EDAD: " + this.edad + "\nSALUD" + this.salud;
    }

    public void comer(){
        if(salud<=90){
            salud+=10;
        } else if (salud>90 && salud<100){
            salud=100;
        }
    }
    public void beber() throws Exception {
        if (salud>=10){
        salud-=10;
        }
        else {
            throw new Exception("Se murió el alumnito...");
        }
    }

    public String verEstado(){
            switch (this.salud){
                case 100:
                    return "Está sanito";
                    //break;
                case 70:
                    return "Happy";
                    //break;
                case 50:
                    return "arriba de la pelota";
                case 30:
                    return "jugoso";
                    //break;
                case 10:
                    return "Wuajardo";
                    //break;
                default:
                    return "Opción no válida";
                    //break;
            }
        }
}
