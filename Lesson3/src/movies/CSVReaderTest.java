package movies;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertTrue;
import static movies.CSVReader.readFileFromPath;

public class CSVReaderTest {
    @Test
    public void readFileFromPathTest() throws Exception {

        String path = "resources/movies.txt";

        Map<String, List<String>> var = readFileFromPath(path, ",",false);

        Assert.assertTrue(!var.isEmpty());

    }

}