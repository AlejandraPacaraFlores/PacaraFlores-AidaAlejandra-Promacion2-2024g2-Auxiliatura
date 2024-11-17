package RacingGame;

public class Coche extends Vehiculo {

    // Constructor
    public Coche(String marca, String modelo, int velocidadMaxima) {
        super(marca, modelo, velocidadMaxima);
    }

    // Implementación del método abstracto acelerar()
    @Override
    public void acelerar() {
        System.out.println("El coche " + marca + " " + modelo + " está acelerando.");
    }
}
