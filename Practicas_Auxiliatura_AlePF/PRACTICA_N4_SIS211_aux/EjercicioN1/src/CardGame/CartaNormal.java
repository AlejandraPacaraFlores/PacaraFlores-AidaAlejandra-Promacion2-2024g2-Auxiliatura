package CardGame;

public class CartaNormal extends Carta {

    // Constructor
    public CartaNormal(int valor, String palo) {
        super(valor, palo);
    }

    // Implementación del método abstracto 
    @Override
    public void jugar() {
        System.out.println("La carta normal (" + valor + " de " + palo + ") ha sido jugada.");
    }
}
