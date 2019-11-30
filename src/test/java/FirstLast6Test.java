import org.junit.Test;

import static org.junit.Assert.*;

public class FirstLast6Test {

    @Test
    public void firstLast6() {
        FirstLast6 firstLast6 = new FirstLast6();
        boolean z = firstLast6.firstLast6(new int [] {1,2,3,4,5,6});
        boolean expected = true;
        assertEquals(z, expected);

    }

    @Test
    public void firstLast61() {
        FirstLast6 firstLast61 = new FirstLast6();
        boolean z = firstLast61.firstLast6(new int[]{1, 2, 3, 4, 5});
        boolean expected = false;
        assertEquals(z, expected);
    }

    @Test
    public void firstLast62() {
        FirstLast6 firstLast62 = new FirstLast6();
        boolean z = firstLast62.firstLast6(new int[]{1, 2, 6, 4, 5});
        boolean expected = false;
        assertEquals(z, expected);
    }

    @Test
    public void firstLast63() {
        FirstLast6 firstLast63 = new FirstLast6();
        boolean z = firstLast63.firstLast6(new int[]{6, 5, 4, 3, 2});
        boolean expected = true;
        assertEquals(z, expected);
    }



}