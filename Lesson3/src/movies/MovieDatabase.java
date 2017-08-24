package movies;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gabrielfior on 24.08.17.
 */
public class MovieDatabase {

    private ArrayList<Movie> movieList;
    private ArrayList<Actor> actorList;

    public ArrayList<Movie> getMovieList() {
        return movieList;
    }


    public ArrayList<Actor> getActorList() {
        return actorList;
    }

    public MovieDatabase() {
        this.actorList = new ArrayList<>();
        this.movieList = new ArrayList<>();
    }

    /**
     *  This method takes in the name of a movie that is not currently in the database
     along with a list of actors for that movie.
     If the movie is already in the database, your code ignores this request
     (this specification is an oversimplification).
     If the movie is a new movie, a movie object is created and added to the movieList.
     If any of the actors happen to be new, they will be added to the actorList.
     * @param name
     * @param actors
     */
    void addMovie(String name, String[] actors){

    }

    void addRating(String name, double rating){
        for (int i = 0; i < this.movieList.size(); i++) {
            if (this.movieList.get(i).equals(name)){
                this.movieList.get(i).setRating(rating);
            }
        }
    }

    void updateRating(String name, double newRating){

        for (int i = 0; i < this.movieList.size(); i++) {
            if (this.movieList.get(i).equals(name)){
                this.movieList.get(i).setRating(newRating);
            }
        }
    }

    /**
     * Returns the name of the actor that has the best average rating for their movies.
     * In the case of a tie, return any one of the best actors.
     * @return
     */
    String getBestActor(){
        //TODO - implement me!
        String actorName = "";
        // iterate over list of actors
        List<Movie> movies = this.getMoviesByActor(actorName);
        double avgGrade = this.calculateAverageRating(movies);

        return "";
    }

    private double calculateAverageRating(List<Movie> movies) {
        return 0.0;
    }

    private List<Movie> getMoviesByActor(String actorName){
        return new ArrayList<>();
    }


    /**
     * Returns the name of the movie with the highest rating.
     * In the case of a tie, return any one of the best movies.
     * @return
     */
    String getBestMovie(){
        return "";
    }


    /**
     * 1. You create a new instance of a movieDatabase.
     * 2. Add all the movies in the file movies.txt.
     * 3. Go through the ratings of the movies in the file ratings.txt and add the ratings for the movies.
     * 4. Now call the methods that you created and print out the name of the best actor and the name of the highest rated movie.
     * @param args
     */
    public static void main(String[] args){


        //TODO - implement me

        MovieDatabase movieDatabase = new MovieDatabase();


    }


}
