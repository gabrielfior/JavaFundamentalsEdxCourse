public class Destroyer extends Ship {
    @Override
    String getShipType() {
        return "destroyer";
    }

    public Destroyer() {
        super();
        setLength(4);
    }
}
