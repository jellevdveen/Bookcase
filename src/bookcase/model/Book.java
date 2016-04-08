package bookcase.model;

/**
 * Created by Kyra on 05/04/2016.
 */
public class Book {
    private long isbn;
    private String title;
    private String author;

    private int height;
    private int thickness;
    private int width;

    private Orientation orientation;

    private static final int defaultHeight = 210;
    private static final int defaultThickness = 15;
    private static final int defaultWidth = 140;




    // full constructor
    public Book (long isbn, String title, String author, int height, int thickness, int width) {
        this.author = author;
        this.isbn = isbn;
        this.title = title;
        this.orientation = Orientation.SPINE;

        if (height > 0) {
            this.height = height;
        } else {
            this.height = defaultHeight;
        }
        if (thickness > 0) {
            this.thickness = thickness;
        } else {
            this.thickness = defaultThickness;
        }
        if (width > 0) {
            this.width = width;
        } else {
            this.width = defaultWidth;
        }
    }

    // constructor with default values for book size
    public Book (long isbn, String title, String author) {
        this(isbn, title, author, defaultHeight, defaultThickness, defaultWidth);
    }


    // getters
    public int getHeight() {
        return this.height;
    }
    public int getThickness() {
        return this.thickness;
    }
    public int getWidth() {
        return this.width;
    }




    public static book



    // voor Kyra, als je dit leest waardeer ik dat zeer!
    // equals method to check whether book is in bookcase-arraylist
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