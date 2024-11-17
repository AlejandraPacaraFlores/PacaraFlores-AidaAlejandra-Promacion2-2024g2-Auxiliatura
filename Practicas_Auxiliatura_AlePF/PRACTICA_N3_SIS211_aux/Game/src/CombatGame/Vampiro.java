package CombatGame;

public class Vampiro extends Enemigo {
    public Vampiro(String nombre) {
        super(nombre, 60, 15);
    }

    @Override
    public int atacar() {
        int daño = dañoBase;
        puntosVida += daño / 2; // Roba vida
        return daño;
    }
}