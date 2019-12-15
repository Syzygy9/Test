import org.junit.Test;

import static org.junit.Assert.*;

public class CommonEndTest {

    //GIVEN
    private CommonEnd commonEnd = new CommonEnd();

    @Test
    public void ReturnTrueByTheSameFirstElement () {
        //WHEN
        boolean actual = commonEnd.commonEnd(new int[] {1,3,5,7,9}, new int[] {1,4,6,8,10});
        //THEN
        assertTrue(actual);

    }
    @Test
    public void ReturnTrueByTheSameFirstAndLastElement() {
        //WHEN
        boolean actual = commonEnd.commonEnd(new int[]{1, 3, 5, 7, 9}, new int[]{1, 2, 3, 4, 9});
        //THEN
        assertTrue(actual);
    }

    @Test
    public void ReturnTrueByTheSameLastElement() {
        //WHEN
        boolean actual = commonEnd.commonEnd(new int[]{2, 3, 5, 7, 9}, new int[]{1, 2, 3, 4, 9});
        //THEN
        assertTrue(actual);
    }

    @Test
    public void ReturnFalseByDifferentFirstAndLastElements() {
        //WHEN
        boolean actual = commonEnd.commonEnd(new int[]{2, 3, 5, 7, 11}, new int[]{1, 2, 3, 4, 9});
        //THEN
        assertFalse(actual);
    }


}