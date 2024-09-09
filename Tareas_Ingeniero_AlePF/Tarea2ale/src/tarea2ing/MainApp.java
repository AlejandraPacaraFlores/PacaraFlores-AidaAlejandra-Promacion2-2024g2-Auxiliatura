package tarea2ing;

public class MainApp {
    public static void main(String[] args) {
        // Crear una instancia de la libreta de contactos
        AddressBook addressBook = new AddressBook();
        
        // Agregar un nuevo contacto
        addressBook.agregarContacto("Juan Pérez", "123456789");
        
        // Guardar los contactos actualizados en el archivo
        addressBook.guardarContactos();
        
        // Mostrar todos los contactos
        System.out.println("Lista de contactos:");
        addressBook.mostrarContactos();
        
        // Buscar un contacto
        Contact encontrado = addressBook.buscarContacto("Juan Pérez");
        if (encontrado != null) {
            System.out.println("Contacto encontrado: " + encontrado);
        } else {
            System.out.println("Contacto no encontrado.");
        }
        
        // Eliminar un contacto
        boolean eliminado = addressBook.eliminarContacto("Juan Pérez");
        if (eliminado) {
            System.out.println("Contacto eliminado.");
            addressBook.guardarContactos();  // Guardar cambios después de eliminar
        } else {
            System.out.println("Contacto no encontrado para eliminar.");}}
}