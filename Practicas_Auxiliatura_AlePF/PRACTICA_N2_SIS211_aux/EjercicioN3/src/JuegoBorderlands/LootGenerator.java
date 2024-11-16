package JuegoBorderlands;

import java.util.Random;

public class LootGenerator {
    private static final String[] TIPOS = {"Arma", "Escudo", "Modificador"};
    private static final String[] RAREZAS = {"Común", "Poco Común", "Raro", "Épico", "Legendario"};
    private static final Random RANDOM = new Random();

    public static Loot generarBotin() {
        String tipo = TIPOS[RANDOM.nextInt(TIPOS.length)];
        String rareza = RAREZAS[RANDOM.nextInt(RAREZAS.length)];
        String atributo1, atributo2, atributo3 = null;

        switch (tipo) {
            case "Arma":
                atributo1 = "Daño: " + (RANDOM.nextInt(50) + 10); // Daño de 10 y 60
                atributo2 = "Precisión: " + (RANDOM.nextInt(101)) + "%"; // Precisión 0% y 100%
                break;
            case "Escudo":
                atributo1 = "Capacidad: " + (RANDOM.nextInt(200) + 50); // Capacidad de 50 y 250
                atributo2 = "Regeneración: " + (RANDOM.nextInt(30) + 1) + " puntos/segundo"; // Regenera de entre 1 y 30
                break;
            case "Modificador":
                atributo1 = "Mejora: +" + (RANDOM.nextInt(21) + 5) + "% estadística"; // Mejorara de 5% y 25%
                atributo2 = "Duración: " + (RANDOM.nextInt(30) + 5) + " segundos"; // Duración de 5 y 35 segundos
                atributo3 = "Rareza extra: " + RAREZAS[RANDOM.nextInt(RAREZAS.length)];
                break;
            default:
                throw new IllegalArgumentException("Tipo de botín desconocido: " + tipo);
        }

        return new Loot(tipo, rareza, atributo1, atributo2, atributo3);
    }
}