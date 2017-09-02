public class Submarine extends Ship {
    @Override
    String getShipType() {
        return "Submarine";
    }


    public Submarine() {
        super();
        setLength(3);
        setHit(new boolean[3]);
    }
}

