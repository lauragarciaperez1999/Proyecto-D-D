package net.salesianos;

public class Personaje {
    String nombre;
    int vida;

    public Personaje(){}

    public Personaje(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + "\nVida: " + vida);
    }
}
