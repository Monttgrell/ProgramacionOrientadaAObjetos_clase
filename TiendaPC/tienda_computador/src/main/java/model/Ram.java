package model;

public class Ram {
    private String marca;
    private String modelo;
    private TipoRam tiporam;
    private int tamanio;

    public Ram(String marca, String modelo, int tamanio, TipoRam tiporam) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setTamanio(tamanio);
        this.setTiporam(tiporam);
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

    public TipoRam getTiporam() {
        return tiporam;
    }

    public void setTiporam(TipoRam tiporam) {
        this.tiporam = tiporam;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ram{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", tiporam=").append(tiporam);
        sb.append(", tamanio=").append(tamanio);
        sb.append('}');
        return sb.toString();
    }
}
