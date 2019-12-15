import org.junit.Test;

import static org.junit.Assert.*;

public class FirstLast6Test {

    //GIVEN
    private FirstLast6 firstLast6 = new FirstLast6();

    @Test
    public void ReturnTrueByLastEquals6() {
        //WHEN
        boolean actual = firstLast6.firstLast6(new int [] {1,2,3,4,5,6});
        //THEN
        assertTrue(actual);

    }

    @Test
    public void ReturnFalseByNeitherFirstNorLastEquals6() {
        //WHEN
        boolean actual = firstLast6.firstLast6(new int[]{1, 2, 3, 4, 5});
        //THEN
        assertFalse(actual);
    }

    @Test
    public void ReturnFalseBy6IsInTheMiddle() {
        //WHEN
        boolean actual = firstLast6.firstLast6(new int[]{1, 2, 6, 4, 5});
        //THEN
        assertFalse(actual);
    }

    @Test
    public void ReturnTrueByFirstEquals6() {
        //WHEN
        boolean actual = firstLast6.firstLast6(new int[]{6, 5, 4, 3, 2});
        //THEN
        assertTrue(actual);
    }



}