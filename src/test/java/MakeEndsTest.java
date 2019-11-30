import org.junit.Test;

import static org.junit.Assert.*;

public class MakeEndsTest {

    @Test
    public void makeEnds() {
        MakeEnds makeEnds = new MakeEnds();
        int[] a = makeEnds.makeEnds(new int[] {1,2,3,4,5,6});
        int[] expected = new int[] {1,6};
        assertArrayEquals(a, expected);
        }

    @Test
    public void makeEnds1() {
        MakeEnds makeEnds1 = new MakeEnds();
        int[] a = makeEnds1.makeEnds(new int[]{0, 1, 2, 3, 4, 5});
        int[] expected = new int[]{0, 5};
        assertArrayEquals(a, expected);
    }


        }