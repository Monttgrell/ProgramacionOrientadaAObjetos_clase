package model;

public class Skin {
    private String nombre;
    private int precio;

    public Skin(String nombre, int precio) throws Exception {
        this.setNombre(nombre);
        this.setPrecio(precio);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if (!nombre.isBlank() && !nombre.isEmpty()) {
            this.nombre = nombre;
        }
        else {
            throw new Exception("Debe agregar nombre al skin");
        }
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) throws Exception {
        if (precio>=0) {
            this.precio = precio;
        }else {
            throw new Exception("El precio debe ser mayor que cero");
        }
    }

    @Override
    public String toString() {
        return "Skin{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
