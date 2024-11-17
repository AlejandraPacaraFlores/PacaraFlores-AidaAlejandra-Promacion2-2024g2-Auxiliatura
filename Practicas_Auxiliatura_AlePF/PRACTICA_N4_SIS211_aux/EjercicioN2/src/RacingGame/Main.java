package RacingGame;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de vehículos
        Coche coche = new Coche("Toyota", "Supra", 250);
        Moto moto = new Moto("Yamaha", "R1", 300);

        // Muestra información de los vehículos
        coche.mostrarInfo();
        moto.mostrarInfo();

        // Aceleración
        coche.acelerar();
        moto.acelerar();

        // Turbo en la moto
        moto.activarTurbo();
    }
}
