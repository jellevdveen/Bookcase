package bookcase.model;

import java.util.ArrayList;

/**
 * Created by Student on 8-4-2016.
 */
public class Plank {
    private ArrayList<Book> plankBooks;
    private int height;

    private static final int defaultHeight = 275;

    // constructors for new planks
    public Plank () {
       this(defaultHeight);
    }
    public Plank (int height) {
        this.plankBooks = new ArrayList<Book>();
        if (height > 0) {
            this.height = height;
        } else {
            this.height = defaultHeight;
        }
    }

    // constructor for existing planks from database
    public Plank (ArrayList<Book> booklistFromDatabase, int height) {
        this.height = height;
        this.plankBooks = booklistFromDatabase;
    }



    public void setHeight(int height) {
        if () {

        }
    }

    public void addBook(Book addedBook) {
        this.plankBooks.add(addedBook);
    }
}
