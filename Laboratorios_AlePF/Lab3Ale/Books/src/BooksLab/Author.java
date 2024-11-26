package BooksLab;

import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;
    private List<Book> books;

    // Inicializa el nombre del autor
    public Author(String name) {
        this.name = name;
        this.books = new ArrayList<>(); // Inicializa la lista de libros
    }

    // Agrega un libro a la lista (con objeto Book)
    public void addBook(Book book) {
        books.add(book);
    }

    // Sobrecarga del método addBook para agregar un libro con título y precio
    public void addBook(String title, double price) {
        Book book = new Book(title, this, price); // Crea un nuevo libro asociado a este autor
        addBook(book); // Llama al método original
    }

    // Da la lista de libros del autor
    public List<Book> getBooks() {
        return books;
    }

    // Obtener información básica del autor
    public String getInfo() {
        return "Author: " + name + " | Number of Books: " + books.size();
    }
}
