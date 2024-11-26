package Tienda;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        // Añadir productos electrónicos
        store.addProduct(new Electronic("Laptop", 1000.0));
        store.addProduct(new Electronic("Smartphone", 500.0));

        // Añadir accesorios
        store.addProduct(new Accessory("Charger", 50.0, "Power"));
        store.addProduct(new Accessory("Headphones", 100.0, "Audio"));

        // Descuento del 10%
        Discountable tenPercentDiscount = product -> product.getPrice() * 0.9;
        System.out.println("Applying 10% Discount:");
        store.applyDiscount(tenPercentDiscount);

        // Descuento fijo de $50
        Discountable fiftyDollarsDiscount = product -> product.getPrice() - 50.0;
        System.out.println("\nApplying $50 Discount:");
        store.applyDiscount(fiftyDollarsDiscount);

        // Descuento combinado: 20% a productos electrónicos y $10 a accesorios
        Discountable combinedDiscount = product -> {
            if (product instanceof Electronic) {
                return product.getPrice() * 0.8;
            } else if (product instanceof Accessory) {
                return product.getPrice() - 10.0;
            }
            return product.getPrice();
        };
        System.out.println("\nApplying Combined Discount:");
        store.applyDiscount(combinedDiscount);
    }
}

