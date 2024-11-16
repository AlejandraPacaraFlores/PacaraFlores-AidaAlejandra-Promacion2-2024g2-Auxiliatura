package JuegoBorderlands;

public class Loot {
    private String tipo;
    private String rareza;
    private String atributo1;
    private String atributo2;
    private String atributo3;

    public Loot(String tipo, String rareza, String atributo1, String atributo2, String atributo3) {
        this.tipo = tipo;
        this.rareza = rareza;
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
        this.atributo3 = atributo3;
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo + 
               ", Rareza: " + rareza + 
               ", " + atributo1 + 
               ", " + atributo2 + 
               (atributo3 != null ? ", " +
atributo3 :"");
    }
}