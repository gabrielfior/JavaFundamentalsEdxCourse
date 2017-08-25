import java.util.Arrays;

public class Squarelotron {

    int[][] squarelotron;
    int size;

    public Squarelotron(int n) {

        this.size = n;

        //fill squarelotron
        this.squarelotron = new int[n][n];

        int counter = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                this.squarelotron[i][j] = counter;
                counter += 1;
            }
        }

    }

    public Squarelotron(int[] newNumbers) {
        this.size = (int) Math.sqrt(newNumbers.length);
        this.squarelotron = new int[size][size];
        int k = 0;
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                squarelotron[i][j] = newNumbers[k];
                k++;
            }
        }
    }

    Integer numberElementsPerRing(int r){
        return 4*(this.size - (2*r - 1));
    }

    public int[] numbers() {
        int[] numberArray = new int[size*size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                numberArray[i * size + j] = squarelotron[i][j];
            }
        }
        return numberArray;
    }

    Squarelotron upsideDownFlip(int ring){

        int[] numbers = numbers();
        int[] newNumbers = new int[size * size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(i == ring - 1 || i == size - ring || j == ring - 1 || j == size - ring){
                    newNumbers[i * size + j] = numbers[(size - i - 1) * size + j];
                }
                else{
                    newNumbers[i * size + j] = numbers[i * size + j];
                }
            }
        }
        Squarelotron newSquarelotron = new Squarelotron(newNumbers);
        return newSquarelotron;
    }

    Squarelotron mainDiagonalFlip(int ring) {

        int[] numbers = numbers();
        int[] newNumbers = new int[size * size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(i == ring -1 || i== size - ring || j == ring - 1 || j == size - ring){
                    newNumbers[i*size +j] = numbers[j*size + 1];
                }
                else{
                    newNumbers[i*size +j] = numbers[i*size + j];
                }
            }
        }

        Squarelotron newSquareLetron = new Squarelotron(newNumbers);
        return newSquareLetron;

    }


    void rotateRight(int numberOfTurns){

    }

    void printSquarelotron(){

        System.out.println(Arrays.deepToString(this.squarelotron));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Squarelotron that = (Squarelotron) o;

        if (size != that.size) return false;
        return Arrays.deepEquals(squarelotron, that.squarelotron);
    }


}
