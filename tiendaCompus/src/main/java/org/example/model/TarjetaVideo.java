package org.example.model;

public class TarjetaVideo {
    private String marca;
    private String modelo;
    private Gpu gpu;
    private Ram ram;

    public TarjetaVideo(String marca, String modelo, Gpu gpu, Ram ram) {
        this.marca = marca;
        this.modelo = modelo;
        this.gpu = gpu;
        this.ram = ram;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Gpu getGpu() {
        return gpu;
    }

    public void setGpu(Gpu gpu) {
        this.gpu = gpu;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TarjetaVideo{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", gpu=").append(gpu);
        sb.append(", ram=").append(ram);
        sb.append('}');
        return sb.toString();
    }
}
