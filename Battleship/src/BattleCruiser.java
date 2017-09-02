public class BattleCruiser extends Ship {
    @Override
    String getShipType() {
        return "battlecruiser";
    }

    public BattleCruiser() {
        super();
        setLength(7);
    }
}
