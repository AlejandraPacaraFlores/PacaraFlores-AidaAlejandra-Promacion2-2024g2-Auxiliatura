package RacingGame;

public class Moto extends Vehiculo implements Turbo {

    public Moto(String marca, String modelo, int velocidadMaxima) {
        super(marca, modelo, velocidadMaxima);
    }

    // Implementación del método abstracto acelerar()
    @Override
    public void acelerar() {
        System.out.println("La moto " + marca + " " + modelo + " está acelerando.");
    }

    // Implementación del método activarTurbo() de la interfaz Turbo
    @Override
    public void activarTurbo() {
        System.out.println("La moto " + marca + " " + modelo + " ha activado el turbo.");
    }
}
