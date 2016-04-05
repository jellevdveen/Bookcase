package bookcase.model;

import java.util.ArrayList;

/**
 * Created by Kyra on 05/04/2016.
 */
public class Bookcase {
    private ArrayList<Book> bookcaseBooks = new ArrayList<Book>();
    private String name = "";

    // constructors, perhaps not all required
    public Bookcase() {

    }
    public Bookcase(String name) {
        this();
        this.name = name;
    }
    public Bookcase(String name, ArrayList<Book> importBookList) {
        this(name);
        this.bookcaseBooks = importBookList;
    }

    // getters
    public String getName(){
        return this.name;
    }
    public ArrayList<Book> getBookcaseBooks(){return bookcaseBooks;}

    // setters
    public void setName(){this.name = name;}
    // don't think we need a setter for book-list

    public void addBook(Book addedBook) {
        if (this.bookcaseBooks.contains(addedBook)) {
            // todo geef error
        } else {
            this.bookcaseBooks.add(addedBook);
        }
    }
}
