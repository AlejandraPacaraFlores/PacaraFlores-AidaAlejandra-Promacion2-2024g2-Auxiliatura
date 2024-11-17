package CombatGame;

import java.util.Random;

public class Personaje {
    protected String nombre;
    protected int nivel;
    protected int puntosVida;
    protected Inventario inventario;

    public Personaje(String nombre) {
        this.nombre = nombre;
        this.nivel = new Random().nextInt(10) + 1;
        this.puntosVida = 100;
        this.inventario = new Inventario();
    }

    public void mostrarEstado() {
        System.out.println(nombre + " (Nivel: " + nivel + ", Puntos de Vida: " + puntosVida + ")");
    }

    public void recibirDaño(int daño) {
        puntosVida -= daño;
        if (puntosVida < 0) puntosVida = 0;
    }

    public void curar() {
        puntosVida += 20;
    }
}
