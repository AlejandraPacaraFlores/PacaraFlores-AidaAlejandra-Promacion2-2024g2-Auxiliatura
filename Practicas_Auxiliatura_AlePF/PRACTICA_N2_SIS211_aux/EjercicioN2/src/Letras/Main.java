package Letras;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita lista de palabras 
        List<String> words = new ArrayList<>();
        System.out.println("Introduzca palabras separadas por espacios OSEA QUE DESPUES DE CADA LETRA OPRIMA LA TECLA 'ENTER' (Para terminar de intoducir las letras escriba 'stop'):");
        while (true) {
            String word = scanner.nextLine();
            if (word.equalsIgnoreCase("stop")) {
                break;
            }
            words.add(word);
        }
        //Contabiliza las palabras que empiezan con la letra q pidio buscar el usuario
        System.out.println("Introduzca una letra para buscarla:");
        char letter = scanner.nextLine().charAt(0);

        try {
            int count = WordCounter.countWordsStartingWith(words, letter);
            System.out.println("La cantidad de palabras que empiezan con '" + letter + "': " + count);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}

