package BooksLab;

public class Book {
    private String title;
    private Author author;
    private double price;

    // Inicializar un libro con su título, autor y precio
    public Book(String title, Author author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;

        // Relación bidireccional: Agrega automáticamente este libro al autor
        author.addBook(this);
    }

    // Información del libro
    public String getInfo() {
        return "Title: " + title + " | Author: " + author.getInfo() + " | Price: $" + price;
    }

    // Getters para acceder a los atributos (opcional)
    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public Author getAuthor() {
        return author;
    }
}
