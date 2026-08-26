package org.example;

import model.Arma;
import model.Personaje;
import model.Raza;
import model.Skin;

import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main { // todas las cosas a utilizar en el "uso del programa" se crean en el main
    static void main() {
        try {
            Skin skingratis=new Skin("starterpack",0);
            Skin skindelujo=new Skin("Luxury Skin",3000);Arma h=new Arma("Hacha",10);
            Arma espada= new Arma("Espada",12);
            Arma estoque= new Arma("Estoque", 120);
            Arma wapah= new Arma("Wapah", 120);


            Personaje waco=new Personaje("Wacoldo", Raza.Humano,skindelujo);


            waco=new Personaje("Wacoldo", Raza.Humano,skingratis);// se setea otra skin
            waco.setArma(estoque);
            System.out.println(waco);


            System.out.println(waco);

            Personaje dio=new Personaje("Diogenes", Raza.Orco,skingratis);
            dio.setArma(wapah);
            System.out.println(dio);

            //FIGHT
            do { //introduccion del do while
                System.out.println("Wacoldo ataca!!");
                int ataquewaco=waco.atacar();
                dio.defensa(ataquewaco);
                //Turno de dio
                System.out.println("Diogenes ataca!!");
                int ataquedio=dio.atacar();
                waco.defensa(ataquedio);

                //resultados
                System.out.println(waco);
                System.out.println();
                System.out.println(dio);
                Thread.sleep(2000);

            }while(waco.getVida()>0 && dio.getVida()>0);

            if(waco.getVida()>0){
                System.out.println("\n Wacoldo Wins!!");
                waco.subinivel();
            }else{
                System.out.println("\n Diogenes Wins!!");
                dio.subinivel();
            }

        } catch (Exception e) {
            System.out.println("ERROR - " + e.getMessage());

        }
    }
}
