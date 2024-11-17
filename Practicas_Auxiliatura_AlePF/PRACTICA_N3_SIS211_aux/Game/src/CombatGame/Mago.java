package CombatGame;

public class Mago extends Personaje {
    private int mana;

    public Mago(String nombre) {
        super(nombre);
        this.mana = 50;
    }
    public void lanzarHechizo() {
        System.out.println(nombre + " lanza un hechizo mágico!");
    }
}