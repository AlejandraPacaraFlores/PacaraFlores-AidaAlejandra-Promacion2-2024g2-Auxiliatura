package FarmSimulatorGame;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de animales
        Vaca vaca = new Vaca("Lola", 5);
        Oveja oveja = new Oveja("Dolly", 3);

        // Mostrar información de los animales
        vaca.mostrarInfo();
        oveja.mostrarInfo();

        // Probar sonidos
        vaca.hacerSonido();
        oveja.hacerSonido();

        // Probar producción
        vaca.producir();
        oveja.producir();
    }
}
