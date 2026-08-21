package org.example;

import model.Personaje;
import model.Raza;
import model.Skin;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main()  {
        try {
            Skin skingratis=new Skin("starterpack",13);
            Skin skindelujo=new Skin("lujo", 15000);

            Personaje waco=new Personaje("Wacoldo", Raza.HUMANO,skingratis);
            System.out.println(waco);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    }

