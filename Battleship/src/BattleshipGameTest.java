import org.junit.Test;

import java.util.List;


public class BattleshipGameTest {
    @Test
    public void parseResponseTest() throws Exception {

        String response = "1, 1; 0, 3; 7, 3; 9, 11; 12, 17";

        List<TargetInput> var  = BattleshipGame.parseResponse(response);
        System.out.println("test");

    }

}