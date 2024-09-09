package Laboratorio2ale;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        addressBook.loadContacts(); // Carga contactos al inicio
        Scanner scanner = new Scanner(System.in);
        Integer option;

        do {
            System.out.println("\n*** Agenda de Contactos ***");
            System.out.println("1. Agregar Contacto");
            System.out.println("2. Ver Contactos");
            System.out.println("3. Buscar Contacto");
            System.out.println("4. Borrar Contacto");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");

            // Valida que la entrada sea un número
            if (scanner.hasNextInt()) {
                option = scanner.nextInt();
                scanner.nextLine(); // Limpia el buffer

                switch (option) {
                    case 1:
                        System.out.print("Ingresa el nombre: ");
                        String name = scanner.nextLine();
                        System.out.print("Ingresa el email: ");
                        String email = scanner.nextLine();
                        System.out.print("Ingresa la edad: ");
                        int age;
                        while (true) {
                            if (scanner.hasNextInt()) {
                                age = scanner.nextInt();
                                scanner.nextLine(); // Limpia el buffer
                                break;
                            } else {
                                System.out.print("Edad inválida. Por favor, ingresa un número: ");
                                scanner.next(); // Descarta entrada inválida
                            }
                        }
                        System.out.print("Ingresa el número de celular: ");
                        String phone = scanner.nextLine();
                        Contact contact = new Contact(name, email, age, phone);
                        addressBook.addContact(contact);
                        addressBook.storeContacts(); // Guarda cambios
                        break;
                    case 2:
                        addressBook.viewContacts();
                        break;
                    case 3:
                        System.out.print("Ingresa el email del contacto a buscar: ");
                        email = scanner.nextLine();
                        addressBook.searchContact(email);
                        break;
                    case 4:
                        System.out.print("Ingresa el email del contacto a borrar: ");
                        email = scanner.nextLine();
                        System.out.print("¿Estás seguro de que deseas borrar este contacto? (s/n): ");
                        String confirm = scanner.nextLine();
                        if (confirm.equalsIgnoreCase("s")) {
                            addressBook.deleteContact(email);
                            addressBook.storeContacts(); // Guarda cambios
                        } else {
                            System.out.println("Eliminación cancelada.");
                        }
                        break;
                    case 5:
                        System.out.println("Saliendo de la aplicación...");
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, intenta nuevamente.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, ingresa un número entre 1 y 5.");
                scanner.nextLine(); // Descarta la entrada inválida
                option = null; // Continua el bucle
            }
        } while (option != 5);

        scanner.close();
    }
}
