package Customer;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

import Objet.Person;

public class customer {
    public static void main(String[] args) throws IOException{
        Scanner read = new Scanner(System.in);
        int port = 1234;
        String host = "localhost";

        Socket cliente = new Socket(host, port);

        ObjectOutputStream salidaDatos = new ObjectOutputStream(cliente.getOutputStream());

        System.out.print("Que cantidad de Usuarios desea enviar al servidor ?: ");
        int cant = read.nextInt();
        read.nextLine();

        ArrayList<Person> arrayPersona = new ArrayList<Person>();

        for (int i = 0 ; i < cant ; i++) {
            System.out.println("Introduzca el Nombre del Usuario:");
            String nombre = read.nextLine();
            System.out.println("Introduzca la Edad del Usuario:");
            String edad = read.nextLine();
            System.out.println("Introduzca el Email del Usuario:");
            String email = read.nextLine();
            Person aux = new Person(nombre, edad, email);
            arrayPersona.add(i, aux);
        }
        
        salidaDatos.writeInt(arrayPersona.size());
        for (int i = 0 ; i < cant ; i++) {
            salidaDatos.writeObject(arrayPersona.get(i));
        }

        cliente.close();
    }
}

   