package RacingGame;

public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int velocidadMaxima;

    public Vehiculo(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    // Método abstracto
    public abstract void acelerar();

    // Mostrar información del vehículo
    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Velocidad Máxima: " + velocidadMaxima + " km/h");
    }
}
