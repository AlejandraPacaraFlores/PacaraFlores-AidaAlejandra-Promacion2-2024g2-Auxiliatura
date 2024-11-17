package CardGame;

public class CartaEspecial extends Carta implements Accionable {

    // Constructor
    public CartaEspecial(int valor, String palo) {
        super(valor, palo);
    }

    // Implementación del método abstracto 
    @Override
    public void jugar() {
        System.out.println("La carta especial (" + valor + " de " + palo + ") ha sido jugada.");
    }

    // Implementación del método realizarAccion() de la interfaz
    @Override
    public void realizarAccion() {
        System.out.println("La carta especial (" + valor + " de " + palo + ") realiza una acción especial.");
    }
}
