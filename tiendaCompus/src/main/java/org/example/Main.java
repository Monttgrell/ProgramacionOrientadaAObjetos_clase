package org.example;

import org.example.model.*;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        try {
            Cpu intel=new Cpu("Intel","i7");
            Cpu amd=new Cpu("AMD","Ryzen9");
            Ram ram=new Ram("Kingston","Xram", TipoRam.DIMM,8);

            TarjetaVideo tvideo=new TarjetaVideo("asus", "RTX 5070 TI",new Gpu("Nvidia","AD104", TipoRam.GDDR,16));

            Disco hd=new Disco("Seagate",1024);
            Computador tarro1=new Computador("Olidata",100,intel,ram, hd);
            Computador tarro2=new Computador("Hp",100,amd,ram, hd);
            Computador tarro3=new Computador("Hp 8gb",300,amd,ram, hd);
            Computador tarro4=new Computador("Hp 8gb",300,amd,ram, hd, new Gpu("AMD","aaa", TipoRam.GDDR,13));
            tarro2.setMemorias(ram);
            System.out.println(tarro1);
            System.out.println("******************");
            System.out.println(tarro2);

            System.out.println(tarro3.getMarca());
            System.out.println(tarro3.getVideo().getRam().getCapacidad()); // Imprimir cosas dentro de cosas dentros de cosas
            // AGREGANDO COMPUS AL INVENTARIO
            Inventario inv=new Inventario();
            inv.setProductos((tarro1));

            // ver como poner el for iterando sobre la lista

            //ver el iter para buscar por serie

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
