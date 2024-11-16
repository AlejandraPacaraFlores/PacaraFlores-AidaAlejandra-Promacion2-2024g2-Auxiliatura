package Fechas;

import java.util.HashMap;
import java.util.Map;

public class DateParser {

    private static final Map<String, Integer> MESES = new HashMap<>();
    
    static {
        MESES.put("enero", 1);
        MESES.put("febrero", 2);
        MESES.put("marzo", 3);
        MESES.put("abril", 4);
        MESES.put("mayo", 5);
        MESES.put("junio", 6);
        MESES.put("julio", 7);
        MESES.put("agosto", 8);
        MESES.put("septiembre", 9);
        MESES.put("octubre", 10);
        MESES.put("noviembre", 11);
        MESES.put("diciembre", 12);
    }

    public static String parseDate(String input) {
        String[] parts = input.split(" ");
        if (parts.length < 4) {
            throw new IllegalArgumentException("Formato de entrada no válido");
        }

        int dia = Integer.parseInt(parts[0]);
        String mes = parts[2].toLowerCase().replace(",", "");
        int anio = Integer.parseInt(parts[3]);

        if (!MESES.containsKey(mes)) {
            return "Error Mes no válido.";
        }

        int mesNumero = MESES.get(mes);

        if (!esFechaValida(dia, mesNumero, anio)) {
            return "Error Fecha no válida.";
        }

        return String.format("%02d / %02d / %04d", dia, mesNumero, anio); //HERENCIA
    }

    private static boolean esFechaValida(int dia, int mes, int anio) {
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (mes == 2 && esBisiesto(anio)) {
            diasPorMes[1] = 29;
        }

        return dia > 0 && dia <= diasPorMes[mes - 1];
    }

    private static boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }
}

