package Memoria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Número de elementos N
        System.out.println("Ingrese el número de elementos N:");
        int n = scanner.nextInt();

        // Validar que N sea válido
        if (n < 1 || n > 100000) {
            System.out.println("N debe estar entre 1 y 105.");
            scanner.close();
            return;
        }

        // Lista de números
        System.out.println("Ingrese la lista de números:");
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num < 0 || num > 109) {
                System.out.println("Cada número debe estar entre 0 y 109.");
                scanner.close();
                return;
            }
            arr.add(num);
        }

        // Maximizar la lista
        List<Integer> result = BitManipulator.maximizeLexicographically(arr);

        // Mostrar el resultado
        System.out.println("Secuencia Maximizada:");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}
