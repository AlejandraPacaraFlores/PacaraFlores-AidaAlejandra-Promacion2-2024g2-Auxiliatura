package Fechas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una fecha (ejemplo: 4 de junio 2004):");
        String entrada = scanner.nextLine();

        try {
            String resultado = DateParser.parseDate(entrada);
            System.out.println("Fecha formateada: " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
