package movies;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static movies.CSVReader.readFileFromPathMovies;
import static movies.CSVReader.readFileFromPathRatings;


public class CSVReaderTest {
    @Test
    public void readFileFromPathMoviesTest() throws Exception {

        String path = "resources/movies.txt";

        Map<String, String[]> var = readFileFromPathMovies(path, ",",false);

        Assert.assertTrue(!var.isEmpty());

    }

    @Test
    public void readFileFromPathRatingsTest() throws Exception {

        String path = "resources/ratings.txt";

        Map<String, String> var = CSVReader.readFileFromPathRatings(path, "\t",true);

        Assert.assertTrue(!var.isEmpty());

    }


}