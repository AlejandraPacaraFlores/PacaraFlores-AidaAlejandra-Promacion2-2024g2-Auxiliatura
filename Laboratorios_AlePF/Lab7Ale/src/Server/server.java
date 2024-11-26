package Server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import Objet.Person;

public class server {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
    int port = 1234;

    ServerSocket server = new ServerSocket(port);
    Socket cliente = server.accept();

    ObjectInputStream entradaDatos = new ObjectInputStream(cliente.getInputStream());

    System. out.println("SERVIDOR EN PERFECTO FUNCIONAMIENTO ... \nA LA ESPERA DE DATOS ... ");

    int cantidadPersonas = entradaDatos.readInt();
    ArrayList<Person> arrayPersona = new ArrayList<Person>();

    for (int i = 0 ; i < cantidadPersonas ; i++) {
        Person datoPersona = (Person)entradaDatos.readObject();
        arrayPersona.add(datoPersona);
    }
    
    System.out.println("NOMBRE\t\tEDAD\t\tEMAIL");
    for (Person datoPersona : arrayPersona) {
        System. out.println(datoPersona.getNombre() +"\t\t" +
        datoPersona.getEdad()+"\t\t"+datoPersona.getEmail());
    }

    server.close();
    }
}