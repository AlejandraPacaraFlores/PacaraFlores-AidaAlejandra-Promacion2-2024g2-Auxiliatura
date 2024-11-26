package BooksLab;

public class Main {
    public static void main(String[] args) {
        // Crea un autor
        Author author = new Author("Gabriel García Márquez");

        // Agrega libros usando ambos métodos de addBook
        author.addBook("Cien Años de Soledad", 15.99);
        author.addBook("El Amor en los Tiempos del Cólera", 18.50);

        // Crea un libro directamente y lo asocia al autor
        Book book = new Book("Crónica de una Muerte Anunciada", author, 12.75);

        // Imprime información del autor
        System.out.println(author.getInfo());

        // Imprime información de todos los libros del autor
        for (Book b : author.getBooks()) {
            System.out.println(b.getInfo());
        }
    }
}
