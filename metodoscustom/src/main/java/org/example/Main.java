package org.example;

import model.Alumno;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Alumno alu = new Alumno("Wacoldo", "Soto", 15);
        System.out.println(alu.getSalud());
        System.out.println(alu.getEdad());
        alu.beber();
        System.out.println(alu);
        alu.comer();
        System.out.println(alu);

        for (int i =0; i <8; i++) {
            alu.beber();
        }

    }
}
