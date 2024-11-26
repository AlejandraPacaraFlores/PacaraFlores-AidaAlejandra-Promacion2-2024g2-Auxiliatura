package Tienda;

public class Accessory implements Product {
    private String name;
    private Double price;
    private String type; // Tipo de accesorio, por ejemplo, "Cargador" o "Auriculares"

    public Accessory(String name, Double price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    @Override
    public String getName() {
        return name + " (" + type + ")";
    }

    @Override
    public Double getPrice() {
        return price;
    }
}

