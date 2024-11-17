package CombatGame;

public class Guerrero extends Personaje {
    private int fuerza;
    
    public Guerrero(String nombre) {
        super(nombre);
        this.fuerza = 50;
    }
    public void atacar() {
        System.out.println(nombre + " realiza un ataque poderoso!");
    }
}