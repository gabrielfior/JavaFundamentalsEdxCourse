package movies;

import java.util.ArrayList;

/**
 * Created by gabrielfior on 24.08.17.
 */
public class Movie {


    private String name;
    private ArrayList<Actor> actors;
    private double rating;

    public Movie() {
        this.actors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }

    public void setActors(ArrayList<Actor> actors) {
        this.actors = actors;
    }

    public void addActor(Actor actor){
        if (!this.actors.contains(actor)) {
            this.actors.add(actor);
        }
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Movie(String name, ArrayList<Actor> actors, double rating) {
        this.name = name;
        this.actors = actors;
        this.rating = rating;
    }


}
