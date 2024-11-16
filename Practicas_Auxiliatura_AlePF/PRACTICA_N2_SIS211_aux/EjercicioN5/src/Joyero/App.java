package Joyero;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Tamaño de la caja (N x N)
        System.out.println("Introduzca el tamaño de la caja:");
             int N = scanner.nextInt();
             int[][] joyero = new int[N][N];
        
        // Datos de la caja
        System.out.println("Introduzca los numeros de las perlas en la caja:");
            for (int i = 0; i < N; i++) {
                 for (int j = 0; j < N; j++) {
                joyero[i][j] = scanner.nextInt();
                }
            }
        
        // Rotaciones de 90 grados en sentido antihorario son necesarias
            int rotaciones = verificarRotaciones(joyero, N);
            System.out.println("El numero minimo de rotaciones necesarias es:" + rotaciones);
            scanner.close();
    }
    
    /**
     * Rotaciones son necesarias para que el joyero vuelva a su estado original.
     * @param joyero Matriz original del joyero.
     * @param N Tamaño de la matriz (N x N).
     * @return Número mínimo de rotaciones necesarias.
     */
    private static int verificarRotaciones(int[][] joyero, int N) {
        int[][] original = new int[N][N];
        
        // Copia la matriz original para compararla 
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                original[i][j] = joyero[i][j];
            }
        }
        
        // Verifica las 4 posibles rotaciones (0, 1, 2, 3)
        for (int i = 0; i < 4; i++) {
            if (i > 0) {
                joyero = rotarAntihorario(joyero, N);
            }
            if (esIgual(joyero, original, N)) {
                return i;  
            }
        }
        return 0;  
    }
    
    /**
     * Rota la matriz 90 grados en sentido antihorario
     * @param matriz Matriz a rotar.
     * @param N Tamaño de la matriz (N x N).
     * @return Mtriz rotada.
     */
    private static int[][] rotarAntihorario(int[][] matriz, int N) {
        int[][] rotada = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                rotada[N - j - 1][i] = matriz[i][j];
            }
        }
        return rotada;
    }
    
    /**
     * Compara dos matrices
     * @param matriz1 1ra matriz a comparar.
     * @param matriz2 2da matriz a comparar.
     * @param N Tamaño de las matrices.
     * @return Verdadero si las matrices son iguales y falso en caso contrario.
     */
    private static boolean esIgual(int[][] matriz1, int[][] matriz2, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (matriz1[i][j] != matriz2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}

