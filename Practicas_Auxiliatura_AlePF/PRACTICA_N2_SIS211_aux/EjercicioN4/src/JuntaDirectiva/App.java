package JuntaDirectiva;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Restricciones : Debe haber de 1 a 100 Directores y la duracion de la reunion es de 1 a 1000m.");
        System.out.println("Ingrese el número de directores que estaran en la Junta Directiva:");
        int numDirectores = scanner.nextInt();

        System.out.println("Ingrese la duración máxima de la reunión en minutos:");
        int maxDuracionReunion = scanner.nextInt();

        if (numDirectores < 1 || numDirectores > 100 || maxDuracionReunion < 1 || maxDuracionReunion > 1000 || maxDuracionReunion < numDirectores) {
            System.out.println("Datos de entrada no válidos. Verifique las restricciones.");
            return;
        }

        // Tiempo máximo de discurso
        int maxTiempoDiscurso = calcularTiempoDiscurso(numDirectores, maxDuracionReunion);

        // Salida del resultado
        System.out.println("La duración máxima de cada discurso por Director es: " + maxTiempoDiscurso + " minutos");

        scanner.close();
    }

    /**
     * Tiempo máximo de discurso de cada director
     * @param numDirectores     N directores
     * @param maxDuracionReunion Duración máxima de la reunión en minutos
     * @return Duración máxima de cada discurso
     */
    private static int calcularTiempoDiscurso(int numDirectores, int maxDuracionReunion) {
        // Duración total disponible para discursos 
        int tiempoDisponible = maxDuracionReunion - (numDirectores - 1);
        // Tiempo máximo por discurso
        return tiempoDisponible / numDirectores;
    }
}
