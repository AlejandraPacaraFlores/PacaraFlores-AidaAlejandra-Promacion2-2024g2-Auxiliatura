package Fracciones;

public class FractionCalculator {

    // Numerador de la fracción continua P_N
    public static int calculateNumerator(int n) {
        if (n == 1) {
            return 1; // Base case: numerador de P1 es 1
        }

        int numerator = 1; // Numerador inicial
        int denominator = 1; // Denominador inicial

        // Fracción de atrás hacia adelante
        for (int i = 2; i <= n; i++) {
            int temp = numerator; 
            numerator = denominator; 
            denominator = temp + denominator; 
        }

        return denominator; // El numerador final es el denominador calculado
    }
}
