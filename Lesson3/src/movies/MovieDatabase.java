package movies;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
     * @param
     */
    void addMovie(String name){
        if (!this.movieList.contains(name)){
            Movie movie = new Movie();
            movie.setName(name);
            this.movieList.add(movie);

        }

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
        double finalAvgGrade = 0.0;
        String bestActor = "";
        // iterate over list of actors
        List<Actor> actors = this.movieList.stream().flatMap(movie -> movie.getActors().stream())
                .distinct().collect(Collectors.toList());

        for (int i = 0; i < actors.size(); i++) {
            actorName = actors.get(i).getName();
            List<Movie> movies = this.getMoviesByActor(actorName);
            double avgGrade = this.calculateAverageRating(movies);

        if (avgGrade > finalAvgGrade){
            finalAvgGrade = avgGrade;
            bestActor = actorName;
            }
        }

        return bestActor;
    }

    private double calculateAverageRating(List<Movie> movies) {

        double rating = 0.0;

        for (int i = 0; i < movies.size(); i++) {
            rating += movies.get(i).getRating();
        }
        rating = rating/movies.size();
        return rating;
    }

    private List<Movie> getMoviesByActor(String actorName){

        List<Movie> moviesOfActor = new ArrayList<>();

        this.movieList.stream().forEach(movie -> {
            if (movie.getActors().contains(actorName)){
                moviesOfActor.add(movie);
            }
        });
        return moviesOfActor;
    }


    /**
     * Returns the name of the movie with the highest rating.
     * In the case of a tie, return any one of the best movies.
     * @return
     */
    String getBestMovie(){
        double rating = 0.;
        String bestMovie = "";
        for (int i = 0; i < this.movieList.size(); i++) {
            if (rating < this.movieList.get(i).getRating()){
                rating = this.movieList.get(i).getRating();
                bestMovie = this.movieList.get(i).getName();
            }
        }
    return bestMovie;
    }


    /**
     * 1. You create a new instance of a movieDatabase.
     * 2. Add all the movies in the file movies.txt.
     * 3. Go through the ratings of the movies in the file ratings.txt and add the ratings for the movies.
     * 4. Now call the methods that you created and print out the name of the best actor and the name of the highest rated movie.
     * @param args
     */
    public static void main(String[] args){

        Map<String, String[]> actorsMovies = CSVReader.readFileFromPathMovies("C:\\Users\\d91421\\IdeaProjects\\JavaFundamentalsEdxCourse\\Lesson3\\resources\\movies.txt", ",", false);

        Map<String, String> ratings = CSVReader.readFileFromPathRatings("C:\\Users\\d91421\\IdeaProjects\\JavaFundamentalsEdxCourse\\Lesson3\\resources\\ratings.txt", "\t", true);

        MovieDatabase movieDatabase = new MovieDatabase();

        actorsMovies.entrySet().stream()
                .forEach(stringListEntry -> {
                    for (int i = 0; i < stringListEntry.getValue().length; i++) {
                        // iterating over movies
                        Movie movie = new Movie();
                        String name = stringListEntry.getValue()[i+1];
                        movie.setName(name);
                        movie.addActor(new Actor(stringListEntry.getKey()));

                        //rating
                        Double rating = Double.valueOf(ratings.get(name.replace(" ","")));
                        movie.setRating(rating);

                        movieDatabase.addMovie(stringListEntry.getKey());
                    }
                });


        System.out.println(movieDatabase.getBestMovie());
        System.out.println(movieDatabase.getBestActor());



    }

}
