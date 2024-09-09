package tarea2ing;

import java.io.*;
import java.util.*;

public class AddressBook {
    private static final String NOMBRE_ARCHIVO = "contactos.txt"; // Nombre del archivo donde se almacenarán los contactos
    private ArrayList<Contact> contactos; // Lista para almacenar los contactos

    // Constructor
    public AddressBook() {
        contactos = new ArrayList<>();
        cargarContactos(); // Cargar contactos al crear la instancia
    }

    // Cargar contactos desde un archivo
    private void cargarContactos() {
        try (BufferedReader br = new BufferedReader(new FileReader(NOMBRE_ARCHIVO))) {
            String linea;
            while ((linea = br.readLine()) != null) { // Leer línea por línea
                String[] datos = linea.split(","); // Separar nombre y teléfono por coma
                Contact contacto = new Contact(datos[0], datos[1]);
                contactos.add(contacto);
            }
        } catch (IOException e) {
            System.out.println("No se pudo cargar el archivo: " + e.getMessage());
        }
    }

    // Guardar contactos en un archivo
    public void guardarContactos() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(NOMBRE_ARCHIVO))) {
            for (Contact contacto : contactos) {
                bw.write(contacto.getNombre() + "," + contacto.getTelefono()); // Escribir nombre y teléfono separados por coma
                bw.newLine(); // Nueva línea para el próximo contacto
            }
        } catch (IOException e) {
            System.out.println("No se pudo guardar el archivo: " + e.getMessage());
        }
    }

    // Agregar un nuevo contacto
    public void agregarContacto(String nombre, String telefono) {
        Contact contacto = new Contact(nombre, telefono);
        contactos.add(contacto);
    }

    // Buscar un contacto
    public Contact buscarContacto(String nombre) {
        for (Contact contacto : contactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) { // Comparar ignorando mayúsculas/minúsculas
                return contacto;
            }
        }
        return null;
    }

    // Eliminar un contacto
    public boolean eliminarContacto(String nombre) {
        Iterator<Contact> iterator = contactos.iterator();
        while (iterator.hasNext()) {
            Contact contacto = iterator.next();
            if (contacto.getNombre().equalsIgnoreCase(nombre)) { // Comparar ignorando mayúsculas/minúsculas
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    // Mostrar todos los contactos
    public void mostrarContactos() {
        for (Contact contacto : contactos) {
            System.out.println(contacto);}}
}