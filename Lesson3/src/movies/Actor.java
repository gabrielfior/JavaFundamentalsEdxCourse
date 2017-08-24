package movies;

import java.util.ArrayList;

/**
 * Created by gabrielfior on 24.08.17.
 */
public class Actor {

    private String name;
    private ArrayList<Movie> movies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    public Actor(String name, ArrayList<Movie> movies) {
        this.name = name;
        this.movies = movies;
    }

}
