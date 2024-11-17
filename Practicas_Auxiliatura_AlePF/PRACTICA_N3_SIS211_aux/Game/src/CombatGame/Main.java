package CombatGame;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Mago mago = new Mago("Gandalf");
        Guerrero guerrero = new Guerrero("Conan");
        System.out.println("¡Inicio del combate!");
        mago.mostrarEstado();
        guerrero.mostrarEstado();
        Random random = new Random();
        while (mago.puntosVida > 0 && guerrero.puntosVida > 0) {
            int dañoMago = random.nextInt(11) + 10;
            int dañoGuerrero = random.nextInt(11) + 10;
            mago.recibirDaño(dañoGuerrero);
            guerrero.recibirDaño(dañoMago);
            System.out.println("\nTurno:");
            mago.lanzarHechizo();
            guerrero.atacar();
            mago.mostrarEstado();
            guerrero.mostrarEstado();
        }
        System.out.println("¡Fin del combate!");
    }
}
