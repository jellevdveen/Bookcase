package bookcase.model;

import java.util.ArrayList;

/**
 * Created by Kyra on 05/04/2016.
 */
public class Bookcase {
    private ArrayList<Plank> bookcasePlanks = new ArrayList<Plank>();
    private String name = "";

    // constructors, perhaps not all required
    public Bookcase() {

    }
    public Bookcase(String name) {
        this();
        this.name = name;
    }
    public Bookcase(String name, ArrayList<Plank> importPlankList) {
        this(name);
        this.bookcaseBooks = importPlankList;
    }

    // getters
    public String getName(){
        return this.name;
    }
    public ArrayList<Plank> getBookcasePlanks(){return bookcasePlanks;}

    // setters
    public void setName(){this.name = name;}

}
