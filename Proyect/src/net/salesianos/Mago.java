package net.salesianos;

public class Mago extends Personaje {
    
    public Mago(String nombre, int vida) {
        super(nombre, vida);

    }

    public void lanzarHechizo() {
        System.out.println(nombre + " ha lanzado un hechizo");
    }

}
