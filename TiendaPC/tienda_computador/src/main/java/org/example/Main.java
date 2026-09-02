package org.example;

import model.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        try {
            Cpu intel = new Cpu("intel", "i7");
            Cpu amd = new Cpu("amd", "i7");
            Ram ram = new Ram("Kingston","x", 16, TipoRam.DIMM);
            Disco hdd= new Disco("Seagate",1024);
            Computador tarro1 = new Computador("Olidata",100, intel, ram, hdd);
            Computador tarro2 = new Computador("Hp",100, amd, ram, hdd);
            tarro2.setMemorias(ram); // agrega otra ram más
            System.out.println(tarro1);
            System.out.println("*********");
            System.out.println(tarro2);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    }
