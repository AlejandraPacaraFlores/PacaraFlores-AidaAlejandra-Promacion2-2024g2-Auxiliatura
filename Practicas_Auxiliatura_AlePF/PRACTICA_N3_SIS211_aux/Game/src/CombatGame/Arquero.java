package CombatGame;

public class Arquero extends Personaje {
    private int destreza;
    
    public Arquero(String nombre) {
        super(nombre);
        this.destreza = 50;
    }
    public void dispararFlecha() {
        System.out.println(nombre + " dispara una flecha con destreza!");
    }
}
