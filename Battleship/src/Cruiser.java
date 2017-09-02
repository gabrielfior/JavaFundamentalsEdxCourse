public class Cruiser extends Ship {
    @Override
    String getShipType() {
        return "cruiser";
    }

    public Cruiser() {
        super();
        setLength(6);
    }
}
