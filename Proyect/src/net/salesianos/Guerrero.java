package net.salesianos;

public class Guerrero extends Personaje {

    public Guerrero(String nombre, int vida) {
        super(nombre, vida);
    }

    public void atacar() {
        System.out.println(nombre + "ataca con espada");
    }
}
