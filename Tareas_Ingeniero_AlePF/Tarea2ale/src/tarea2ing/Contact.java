package tarea2ing;

public class Contact {
    private String nombre;
    private String telefono;

    // Constructor
    public Contact(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Método toString para mostrar el contacto
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Teléfono: " + telefono;}
}
