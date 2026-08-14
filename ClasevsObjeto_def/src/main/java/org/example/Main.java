package org.example;

import model.Persona;

public class Main {
    static void main() { // acá los parentesis mandan
        System.out.println("Hola Mundo en Java");

        try {
            Persona persona1=new Persona(); // se crea persona 2
            System.out.println(persona1);
            Persona persona2= new Persona(); // se crea persona2
            System.out.println(persona2);

            persona1.setNombre("Cristobal");
            persona2.setNombre("Bastian");

            System.out.println(persona1.getNombre()); // metodo getnombre para coseguir el nombre
            System.out.println(persona2.getNombre());
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage()); // agarra el error "e" y tira el mensaje que corresponda
        }


    }
}

