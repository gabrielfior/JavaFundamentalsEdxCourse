package movies;

import org.junit.Before;
import org.junit.Test;




public class MovieDatabaseTest {
    @Before
    public MovieDatabase setUp() throws Exception {

        MovieDatabase movieDatabase = new MovieDatabase();
        return movieDatabase;
    }

    @Test
    public void getMovieList() throws Exception
    {
     MovieDatabase movieDatabase = setUp();


    }

    @Test
    public void getActorList() throws Exception {
        MovieDatabase movieDatabase = setUp();

    }

    @Test
    public void addMovie() throws Exception {
    }

    @Test
    public void addRating() throws Exception {
    }

    @Test
    public void updateRating() throws Exception {



    }

    @Test
    public void getBestActor() throws Exception {
    }

    @Test
    public void getBestMovie() throws Exception {
    }

}