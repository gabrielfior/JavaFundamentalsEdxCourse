

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class BattleshipGame {

    public static void main(String[] args){


        System.out.println("The input format should look like this: 1, 1; 0, 3; 7, 3; 9, 11; 12, 17");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in 5 shots: \n");
        String response = scanner.nextLine();
        List<TargetInput> var = parseResponse(response);
        //System.out.println(var.toString());
        System.out.println("Start game!");



    }

    public static List<TargetInput> parseResponse(String response){
        List<TargetInput> targets = new ArrayList<>();

        String[] parseResponse = response.replace(" ","").split(";");
        for (int i = 0; i < parseResponse.length; i++) {
            String[] rowCol = parseResponse[i].split(",");
            targets.add(new TargetInput(Integer.valueOf(rowCol[0]),Integer.valueOf(rowCol[1])));
        }

        return targets;
    }

}
