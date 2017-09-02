public class EmptySea extends Ship {
    @Override
    String getShipType() {
        return "empty";
    }

    public EmptySea() {
        super();
        setLength(1);
    }

    @Override
    boolean shootAt(int row, int column) {
        return false;
    }

    @Override
    boolean isSunk() {
        return false;
    }

    @Override
    public String toString() {
        return "E";
    }
}
