package CombatGame;

public class Enemigo {
    protected String nombre;
    protected int puntosVida;
    protected int dañoBase;

    public Enemigo(String nombre, int puntosVida, int dañoBase) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.dañoBase = dañoBase;
    }

    public int atacar() {
        return dañoBase;
    }

    public void recibirDaño(int daño) {
        puntosVida -= daño;
        if (puntosVida < 0) puntosVida = 0;
    }

    public boolean estaVivo() {
        return puntosVida > 0;
    }
}
