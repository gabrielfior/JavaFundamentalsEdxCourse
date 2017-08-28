package movies;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class CSVReader {



    public static Map<String, String[]> readFileFromPathMovies(String csvFile, String separator, Boolean skipLine) {

        Map<String, String[]> listReturn = new HashMap<>();
        //creating File instance to reference text file in Java
        File text = new File(csvFile);

        //Creating Scanner instnace to read File in Java
        Scanner scnr = null;
        List<String> listLines = null;
        try {
            scnr = new Scanner(text);


            //Reading each line of file using Scanner class
            listLines = new ArrayList<>();
            int lineNumber = 1;
            while (scnr.hasNextLine()) {
                if (lineNumber == 1 && skipLine == true) {
                    lineNumber++;
                    continue;
                }
                String line = scnr.nextLine();
                String[] entries = line.split(separator);

                listReturn.put(returnActorFromLine(entries), returnMoviesFromLine(entries));

                lineNumber++;
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return listReturn;

    }

    public static Map<String,String> readFileFromPathRatings(String csvFile, String separator, Boolean skipLine) {

        Map<String, String> listReturn = new HashMap<>();
        //creating File instance to reference text file in Java
        File text = new File(csvFile);

        //Creating Scanner instnace to read File in Java
        Scanner scnr = null;

        try {
            scnr = new Scanner(text);


            //Reading each line of file using Scanner class

            int lineNumber = 1;
            while (scnr.hasNextLine()) {
                if (lineNumber == 1 && skipLine == true) {
                    lineNumber++;
                    continue;
                }
                String line = scnr.nextLine();
                String[] entries = line.split(separator);

                listReturn.put(returnMovieFromRatingLine(entries), returnRatingFromRatingLine(entries));

                lineNumber++;
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return listReturn;

    }

    private static String returnMovieFromRatingLine(String[] entries) {
        return entries[0];
    }

    private static String returnRatingFromRatingLine(String[] entries) {

        return entries[1];

    }


    private static String returnActorFromLine(String[] entries) {
        return entries[0];
    }

    private static String[] returnMoviesFromLine(String[] entries) {

        String[] movies = new String[entries.length];

        for (int i = 1; i < entries.length; i++) {
            movies[i] = (entries[i]);
        }
        return movies;
    }
}