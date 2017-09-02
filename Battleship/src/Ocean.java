public class Ocean {

    public Ship[][] ships = new Ship[20][20];
    private int shotsFired;
    private int hitCount;
    private int shipsSunk; //total of 13 ships

    private final int oceanSize = 20;

    public Ocean() {

        this.ships = new EmptySea[oceanSize][oceanSize];
        for (int i = 0; i < oceanSize; i++) {
            for (int j = 0; j < oceanSize; j++) {
                this.ships[i][j] = new EmptySea();
            }
        }
        this.hitCount = 0;
        this.shipsSunk = 0;
    }


    void placeAllShipsRandomly(){

        //IMPLEMENT me
        System.out.println("Implement method");
    }

    boolean isOccupied(int row, int column){

        if (this.ships[row][column].getShipType().equals(new EmptySea().getShipType())){
            return false;
        }
        return true;
    }

    boolean shootAt(int row, int column){
        // FIXME
        return false;
    }

    public int getShotsFired(){
        return this.shotsFired;
    }

    public int getHitCount(){
        return this.hitCount;
    }

    public int getShipsSunk(){
        return this.getShipsSunk();
    }

    public boolean isGameOver(){
        //FIXME
        return false;
    }

    public Ship[][] getShipArray(){
        return this.ships;
    }

    void print(){
        // add columns
        String columnString = " ";
        for (int i = 0; i < oceanSize; i++) {
            columnString += " " + String.format("%02d", i);;
        }
        System.out.println(columnString);

        for (int i = 0; i < this.oceanSize; i++) {

            String output = String.valueOf(i);
            for (int j = 0; j < oceanSize; j++) {
                output += " " + String.valueOf(this.ships[i][j]) + " ";
            }
            System.out.println(output);
        }
    }

}
