public class LightCruiser extends Ship {
    @Override
    String getShipType() {
        return "light cruiser";
    }

    public LightCruiser() {
        super();
        setLength(5);
        setHit(new boolean[5]);
    }
}
