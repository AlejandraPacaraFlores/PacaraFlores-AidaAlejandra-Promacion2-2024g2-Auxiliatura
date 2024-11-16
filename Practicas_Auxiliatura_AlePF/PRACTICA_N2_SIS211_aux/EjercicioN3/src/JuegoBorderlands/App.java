package JuegoBorderlands;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Loot> lootList = new ArrayList<>();
        boolean seguirJugando = true;

        System.out.println("¡Bienvenido al simulador de botín de Borderlands!");

        while (seguirJugando) {
            System.out.println("¡Has derrotado a un enemigo!");
            Loot loot = LootGenerator.generarBotin();
            lootList.add(loot);
            System.out.println("Botín encontrado:");
            System.out.println(loot);

            System.out.println("\n¿Quieres seguir enfrentándote a enemigos? (s/n):");
            String respuesta = scanner.nextLine().trim().toLowerCase();
            seguirJugando = respuesta.equals("s");
        }

        System.out.println("\nResumen del botín obtenido:");
        if (lootList.isEmpty()) {
            System.out.println("No obtuviste ningun botín. ¡Mejor suerte la próxima vez!");
        } else {
            lootList.forEach(System.out::println);
        }

        System.out.println("Gracias por jugar. ¡Hasta la próxima!");
        scanner.close();
    }
}

