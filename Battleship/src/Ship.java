public abstract class Ship {

    private int bowRow;
    private int bowColumn;
    private int length;
    private boolean horizontal;
    private boolean[] hit;

    public int getBowRow() {
        return bowRow;
    }

    public void setBowRow(int bowRow) {
        this.bowRow = bowRow;
    }

    public int getBowColumn() {
        return bowColumn;
    }

    public void setBowColumn(int bowColumn) {
        this.bowColumn = bowColumn;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isHorizontal() {
        return horizontal;
    }

    public void setHorizontal(boolean horizontal) {
        this.horizontal = horizontal;
    }

    public boolean[] getHit() {
        return hit;
    }

    public void setHit(boolean[] hit) {
        this.hit = hit;
    }

    abstract String getShipType();

    boolean okToPlaceShipAt(int row, int column, boolean horizontal, Ocean ocean){

        if (horizontal){
            int oldRow = row;
            int oldColumn = column;
            column = oldRow;
            row = oldColumn;
        }

        // check if ship already placed there

        // check if is touching another ship

        // check if not continues beyond the array

        return true;
    }



    boolean shootAt(int row, int column){

        if (isHorizontal()) {
            //check difference in cols
            return checkIfHitInsideShipArea(this.getBowColumn(),column);
        }
            else{
            return checkIfHitInsideShipArea(this.getBowRow(), row);
        }

        }

    private Boolean checkIfHitInsideShipArea(int lengthFromShip,int column) {
        if (Math.abs(lengthFromShip - column) <= this.getLength() && !isSunk()) {
            boolean[] bool = getHit();
            bool[lengthFromShip - column] = true;
            return true;
        }
        return false;
    }

    boolean isSunk(){
        for (int i = 0; i < getHit().length; i++) {
            Boolean bool = getHit()[i];
            if (!bool){
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        if (isSunk()){
            return "x";
        }
        return "S";
    }
}
