package Memoria;

import java.util.Collections;
import java.util.List;

public class BitManipulator {

    /**
     * Maximiza la lista usando operaciones de intercambio de bits
     * @param arr Números enteros
     * @return Maximizada lexicográficamente
     */
    public static List<Integer> maximizeLexicographically(List<Integer> arr) {
        // Orden descendente
        Collections.sort(arr, (a, b) -> Integer.compare(b, a));
        return arr;
    }
}
