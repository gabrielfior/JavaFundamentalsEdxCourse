package movies;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class CSVReader {

    public static Map<String, List<String>> readFileFromPath(String csvFile, String separator, Boolean skipLine) {


        Map<String, List<String>> listReturn = new HashMap<>();
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
                if (lineNumber == 1 && skipLine==true){
                    lineNumber++;
                    continue;
                }
                String line = scnr.nextLine();
                String[] entries = line.split(separator);
                String actorName = entries[0];
                List<String> movies = new ArrayList<>();

                for (int i = 1; i < entries.length; i++) {
                    movies.add(entries[i]);
                }
                listReturn.put(actorName, movies);
                //System.out.println("line " + lineNumber + " :" + line);

                lineNumber++;
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return listReturn;

    }



}
