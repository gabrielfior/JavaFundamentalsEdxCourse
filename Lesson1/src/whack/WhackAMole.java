// remember to comment out package in order when submitting
package whack;

import java.util.Arrays;
import java.util.Scanner;

public class WhackAMole {

    int score;
    int molesLeft;
    int attemptsLeft;

    char[][] moleGrid;

    public WhackAMole(int numAttempts, int gridDimension) {
        this.moleGrid = new char[gridDimension][gridDimension];

        for (int i = 0; i < gridDimension; i++) {
            for (int j = 0; j < gridDimension; j++) {
                this.moleGrid[i][j] = '*';
            }
        }

        this.attemptsLeft = 5;
    }

    boolean place(int x, int y){
        //TODO
        //put mole in place.
        // return true if you can
        try {
            this.moleGrid[x][y] = 'M';
            this.molesLeft = this.molesLeft + 1;

            return true;

        }
        catch (Exception e){
            return false;
        }
    }

    void whack(int x, int y){
        //TODO
        //If that location contains a mole,
        // the score, number of attemptsLeft, and molesLeft is updated.
        // If that location does not contain a mole, only attemptsLeft is updated
        attemptsLeft = attemptsLeft - 1;

        if (moleGrid[x][y] == 'M'){
            score = score + 1;
            molesLeft = molesLeft - 1;
            moleGrid[x][y] = 'W';
            System.out.println("Mole whacked! Well done!");
        }
        else {
            System.out.println("Ops missed!");
        }
    }

    void printGridToUser(){
        //TODO
        System.out.println("oi");
    }

    void printGrid(){
        //print whole grid
        //TODO - implement me
        System.out.println(Arrays.deepToString(moleGrid));

    }

    public static void main(String[] args){
        WhackAMole whack = new WhackAMole(50,10);

        int numMoles = 10;

        //place moles
        for (int i = 0; i < numMoles; i++) {
            whack.place(0,0);
            whack.place(0,1);
            whack.place(0,2);
            whack.place(0,3);
            whack.place(0,4);
            whack.place(0,5);
            whack.place(0,6);
            whack.place(0,7);
            whack.place(0,8);
            whack.place(0,9);
        }

        // Get user input
        Scanner scanner = new Scanner(System.in);
        while (whack.attemptsLeft > 0 && whack.molesLeft > 0){
            System.out.println("Number of attempts left: "+ whack.attemptsLeft);
            System.out.println("Enter x: ");
            int x = scanner.nextInt();
            System.out.println("Enter y: ");
            int y = scanner.nextInt();

            if (x==-1 & y==-1){// user gives up
                //show entire grid
                whack.printGrid();
                break;
            }
            else {
                // take whack
                whack.whack(x, y);

            }

        }
    }
}
