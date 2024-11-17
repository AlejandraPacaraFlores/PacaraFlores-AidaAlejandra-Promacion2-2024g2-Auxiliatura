package CardGame;

public abstract class Carta {
    protected int valor;
    protected String palo;

    // Constructor
    public Carta(int valor, String palo) {
        this.valor = valor;
        this.palo = palo;
    }

    // Método abstracto
    public abstract void jugar();

    // Método para mostrar los detalles de la carta
    public void mostrarCarta() {
        System.out.println("Carta: " + valor + " de " + palo);
    }
}

