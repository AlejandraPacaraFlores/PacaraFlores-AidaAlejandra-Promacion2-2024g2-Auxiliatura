package CombatGame;

public class Jefe extends Enemigo {
    private double multiplicadorDaño;

    public Jefe(String nombre, int puntosVida, int dañoBase, double multiplicadorDaño) {
        super(nombre, puntosVida, dañoBase);
        this.multiplicadorDaño = multiplicadorDaño;
    }

    public void hablar() {
        System.out.println(nombre + ": ¡Prepárate para enfrentar tu destino!");
    }

    public int ataqueCritico() {
        return (int) (dañoBase * multiplicadorDaño);
    }
}
