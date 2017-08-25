import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class SquarelotronTest {
    @Test
    public void numberElementsPerRing() throws Exception {

        Squarelotron squarelotron = new Squarelotron(3);
        assertEquals(Integer.valueOf(8),squarelotron.numberElementsPerRing(1));

        Squarelotron squarelotron2 = new Squarelotron(4);
        assertEquals(Integer.valueOf(12),squarelotron2.numberElementsPerRing(1));

        Squarelotron squarelotron3 = new Squarelotron(5);
        assertEquals(Integer.valueOf(16),squarelotron3.numberElementsPerRing(1));

    }

    @Test
    public void mainDiagonalFlip() throws Exception {
        Squarelotron squarelotron5 = new Squarelotron(5);

        Squarelotron squarelotron5DiagonalFlip = squarelotron5.mainDiagonalFlip(1);

        // suggestion from guide
        Squarelotron answer = new Squarelotron(5);

        int[] firstRow = {1,6,11,16,21};
        int[] secondRow = {2,7,8,9,22};
        int[] thirdRow = {3,12,13,14,19};
        int[] fourthRow = {4,17,18,23,24};
        int[] fifthRow = {5,10,15,20,25};

        answer.squarelotron[0] = firstRow;
        answer.squarelotron[1] = secondRow;
        answer.squarelotron[2] = thirdRow;
        answer.squarelotron[3] = fourthRow;
        answer.squarelotron[4] = fifthRow;

        System.out.println("expected");
        answer.printSquarelotron();
        assertEquals(squarelotron5DiagonalFlip, answer);

    }

    @Test
    public void rotateRight() throws Exception {
        fail("Method not implemented");

    }

    @Test
    public void upsideDownFlip() throws Exception {
        Squarelotron squarelotron4 = new Squarelotron(4);

        Squarelotron squarelotron4UpsideDown = squarelotron4.upsideDownFlip(4);

        // suggestion from guide
        Squarelotron answer = new Squarelotron(4);

        int[] firstRow = {13,14,15,16};
        int[] secondRow = {9,6,7,12};
        int[] thirdRow = {5,10,11,8};
        int[] fourthRow = {1,2,3,4};

        answer.squarelotron[0] = firstRow;
        answer.squarelotron[1] = secondRow;
        answer.squarelotron[2] = thirdRow;
        answer.squarelotron[3] = fourthRow;

        assertEquals(squarelotron4UpsideDown, answer);
    }

}