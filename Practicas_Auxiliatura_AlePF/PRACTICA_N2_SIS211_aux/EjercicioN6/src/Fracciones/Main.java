package Fracciones;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the level N (1 ≤ N ≤ 40):");
        int n = scanner.nextInt();

        if (n < 1 || n > 40) {
            System.out.println("N must be between 1 and 40.");
        } else {
            int numerator = FractionCalculator.calculateNumerator(n);
            System.out.println("The numerator of P" + n + " is: " + numerator);
        }
        scanner.close();
    }
}

