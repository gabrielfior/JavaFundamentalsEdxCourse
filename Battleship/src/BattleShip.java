public class BattleShip extends Ship {
    @Override
    String getShipType() {
        return "battleship";
    }

    public BattleShip() {
        super();
        setLength(8);
    }
}
