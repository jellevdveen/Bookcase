package bookcase.model;

/**
 * Created by Kyra on 05/04/2016.
 */
public class Book {
    private long isbn;
    private String title;
    private String author;

    public Book(long isbn, String title, String author) {
        this.author = author;
        this.isbn = isbn;
        this.title = title;
    }

    @Override
    public boolean equals(Object O) {
        if (O instanceof Book) {
            if (((Book) O).isbn == this.isbn) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return (this.title + " " + this.author);
    }
}