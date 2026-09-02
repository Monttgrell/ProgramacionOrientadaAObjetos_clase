package model;

import java.util.ArrayList;
import java.util.List;

public class Computador {
    private String marca;
    private int serie;
    private Cpu cpu;
    private List<Ram> memorias=new ArrayList<>();
    private List<Disco> discos= new ArrayList<>();
    private TarjetaVideo video;

    public Computador(String marca, int serie, Cpu cpu, Ram ram, Disco discos) throws Exception {
        this.setMarca(marca);
        this.setSerie(serie);
        this.setCpu(cpu);
        this.setMemorias(ram);
        this.setDiscos(discos);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (!marca.isBlank() && !marca.isEmpty()) {
            this.marca = marca;
        }
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) throws Exception {
        if (serie>=100) {
            this.serie = serie;
        }else{
            throw new Exception("el numero de serie debe ser mayor que 100");
        }
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) throws Exception {
        if (cpu!=null) {
            this.cpu = cpu;
        }else {
            throw new Exception("Debe agregar CPU");
        }
    }

    public List<Ram> getMemorias() {
        return memorias;
    }

    public void setMemorias(Ram ram) throws Exception {
        if(ram!=null){
            this.memorias.add(ram);
        }else{
            throw new Exception("La ram no puede ser nulo");
        } ;
    }

    public List<Disco> getDiscos() {
        return discos;
    }

    public void setDiscos(Disco disco) throws Exception {
        if(discos !=null) {
            this.discos.add(disco);
        }else{
            throw new Exception("Debe agregar un disco");
        }
    }

    public TarjetaVideo getVideo() {
        return video;
    }

    public void setVideo(TarjetaVideo video) throws Exception {
        if (video!=null) {
            this.video = video;
        }else{
            throw new Exception("debe agregar una tarjeta dde video");
        }
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Computador{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", serie=").append(serie);
        sb.append(", cpu=").append(cpu);
        sb.append(", memorias=").append(memorias);
        sb.append(", discos=").append(discos);
        sb.append(", video=").append(video);
        sb.append('}');
        return sb.toString();
    }
}
