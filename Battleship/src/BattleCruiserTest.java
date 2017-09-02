
import org.junit.Assert;import org.junit.Test;

import static org.junit.Assert.*;


public class BattleCruiserTest {
    @Test
    public void getShipType() throws Exception {

        BattleCruiser battleCruiser = new BattleCruiser();

        Assert.assertEquals("battlecruiser", battleCruiser.getShipType());

    }

}