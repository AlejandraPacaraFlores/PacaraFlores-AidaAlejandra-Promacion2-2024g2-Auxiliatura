package FarmSimulatorGame;

public abstract class Animal {
    protected String nombre;
    protected int edad;

    // Constructor
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método abstracto
    public abstract void hacerSonido();

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + " años");
    }
}
