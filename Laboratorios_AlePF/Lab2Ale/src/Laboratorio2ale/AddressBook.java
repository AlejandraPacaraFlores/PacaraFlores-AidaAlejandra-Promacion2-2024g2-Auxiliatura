package Laboratorio2ale;

import java.io.*;
import java.util.HashMap;

public class AddressBook implements Serializable {
    private static final long serialVersionUID = 1L;

    private HashMap<String, Contact> contacts;
    private static final String FILE_NAME = "contacts.dat"; // Nombre del archivo de almacenamiento

    public AddressBook() {
        this.contacts = new HashMap<>();
    }

    // Método para agregar un contacto
    public void addContact(Contact contact) {
        if (contacts.containsKey(contact.getEmail())) {
            System.out.println("Ya existe un contacto con este email.");
        } else {
            contacts.put(contact.getEmail(), contact);
            System.out.println("Contacto agregado exitosamente.");
        }
    }

    // Método para ver todos los contactos
    public void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("La agenda está vacía.");
            return;
        }
        System.out.println("\nLista de Contactos:");
        System.out.println("--------------------");
        for (Contact contact : contacts.values()) {
            System.out.println(contact);
        }
    }

    // Método para buscar un contacto por email
    public void searchContact(String email) {
        if (contacts.containsKey(email)) {
            System.out.println("Contacto encontrado:");
            System.out.println(contacts.get(email));
        } else {
            System.out.println("Contacto no encontrado.");
        }
    }

    // Método para eliminar un contacto por email
    public void deleteContact(String email) {
        if (contacts.containsKey(email)) {
            contacts.remove(email);
            System.out.println("Contacto eliminado.");
        } else {
            System.out.println("No se encontró un contacto con el email ingresado.");
        }
    }

    // Método para guardar los contactos en un archivo
    public void storeContacts() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(this.contacts);
            System.out.println("Contactos guardados exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar los contactos: " + e.getMessage());
        }
    }

    // Método para cargar los contactos desde un archivo
    @SuppressWarnings("unchecked")
    public void loadContacts() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            System.out.println("No se encontraron contactos existentes. Se comenzara con una agenda vacía.");
            return;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            this.contacts = (HashMap<String, Contact>) ois.readObject();
            System.out.println("Contactos cargados exitosamente.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar los contactos: " + e.getMessage());
        }
    }
}
