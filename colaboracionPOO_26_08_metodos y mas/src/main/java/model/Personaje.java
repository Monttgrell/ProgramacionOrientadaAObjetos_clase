package model;

import java.util.Random;

public class Personaje {
    private String nombre;
    private int vida;
    private int defensa;
    private Raza raza;
    private int nivel;
    private Arma arma;
    private Skin skin;

    public Personaje(String nombre, Raza raza, Skin skin) throws Exception {
        this.setNombre(nombre);
        this.setRaza(raza);
        this.nivel=1;
        this.vida=100;
        this.defensa=2;
        arma=null;
        this.setSkin(skin);
    }

    /*GETTER SETTERS*/
    public void setNombre(String nombre) throws Exception {
        if (!nombre.isBlank() && !nombre.isEmpty() && nombre!=null){
            this.nombre=nombre;
        }else {
            throw new Exception("Debe agregar el nombre del personaje");
        }
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setRaza(Raza raza) throws Exception {
        if (raza!=null){
            this.raza=raza;
        }else{
            throw new Exception("La raaza no puede ser null");
        }
    }

    public void setArma(Arma arma){
        if(arma!=null){
            this.arma=arma;
        }
    }

    public Arma getArma(){
        return this.arma;
    }

    public void setSkin(Skin skin) throws Exception {
        if(skin!=null){
            this.skin=skin;
        }else {
            throw new Exception("Debe agregar skin");
        }
    }

    public Skin getSkin(){
        return this.skin;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("Personaje{");
        sb.append(nombre.toUpperCase());
        sb.append("\n vida=").append(vida);
        sb.append("\n raza=").append(raza);
        sb.append("\n nivel=").append(nivel);
        if (arma!=null) {
            sb.append("\n arma=").append(arma.getNombre());
        }else {
            sb.append("\n arma=").append("No tiene arma asignada");
        }
        sb.append("\n skin=").append(skin.getNombre()).append('}');
        return sb.toString();
    }

    public int atacar(){
        Random rnd=new Random();
        int valor_ranndom=rnd.nextInt(1,2);
        return this.arma.getDamage()* valor_ranndom;
    }

    public void defensa(int dmg){
        Random rnd=new Random();
        int valor_ranndom=rnd.nextInt(1,5);
        int total_dmg=dmg-(this.defensa*valor_ranndom);
        if(total_dmg>0) {
            this.vida -= total_dmg;
        }
    }

    public void subinivel(){
        this.defensa+=2;
        this.nivel+=1;
        this.vida=nivel*100;

    }

    public int getVida() {
        return this.vida;
    }
}
