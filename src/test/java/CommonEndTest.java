import org.junit.Test;

import static org.junit.Assert.*;

public class CommonEndTest {

    @Test
    public void commonEnd() {
        CommonEnd commonEnd = new CommonEnd();
        boolean i = commonEnd.commonEnd(new int[] {1,3,5,7,9}, new int[] {1,4,6,8,10});
        boolean expected = true;
        assertEquals(i, expected);

    }
    @Test
    public void commonEnd1() {
        CommonEnd commonEnd1 = new CommonEnd();
        boolean i = commonEnd1.commonEnd(new int[]{1, 3, 5, 7, 9}, new int[]{1, 2, 3, 4, 9});
        boolean expected = true;
        assertEquals(i, expected);
    }

    @Test
    public void commonEnd2() {
        CommonEnd commonEnd2 = new CommonEnd();
        boolean i = commonEnd2.commonEnd(new int[]{2, 3, 5, 7, 9}, new int[]{1, 2, 3, 4, 9});
        boolean expected = true;
        assertEquals(i, expected);
    }

    @Test
    public void commonEnd3() {
        CommonEnd commonEnd4 = new CommonEnd();
        boolean i = commonEnd4.commonEnd(new int[]{2, 3, 5, 7, 11}, new int[]{1, 2, 3, 4, 9});
        boolean expected = false;
        assertEquals(i, expected);
    }


}