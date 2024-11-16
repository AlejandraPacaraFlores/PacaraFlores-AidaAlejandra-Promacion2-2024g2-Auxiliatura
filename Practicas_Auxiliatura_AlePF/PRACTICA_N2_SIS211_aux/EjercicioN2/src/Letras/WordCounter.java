package Letras;

import java.util.List;

public class WordCounter {

    /**
     *Cuenta cuantas palabras tiene la misma letra
     * @param word lista de palabras 
     * @param letter letras buscada
     * @return el numero de palabras q comienzan con la misma letra
     */
    public static int countWordsStartingWith(List<String> words, char letter) {
        if (words == null || words.isEmpty()) {
            throw new IllegalArgumentException("Error la lista de palabras no puede estar vacia.");
        }

        letter = Character.toLowerCase(letter); 
        int count = 0;

        for (String word : words) {
            if (word != null && !word.isEmpty() && Character.toLowerCase(word.charAt(0)) == letter) {
                count++;
            }
        }
        return count;
    }
}
