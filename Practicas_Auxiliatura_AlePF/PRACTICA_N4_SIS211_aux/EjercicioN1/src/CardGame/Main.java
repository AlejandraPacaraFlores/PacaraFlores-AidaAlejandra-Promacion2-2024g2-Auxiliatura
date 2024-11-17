package CardGame;

public class Main {
    public static void main(String[] args) {
        // Instancias de cartas
        Carta cartaNormal = new CartaNormal(7, "Corazones");
        CartaEspecial cartaEspecial = new CartaEspecial(1, "Espadas");

        // MUSTRA LAS cartas
        cartaNormal.mostrarCarta();
        cartaEspecial.mostrarCarta();

        // Jugar las cartas
        cartaNormal.jugar();
        cartaEspecial.jugar();

        // Realizar acción especial
        cartaEspecial.realizarAccion();
    }
}
