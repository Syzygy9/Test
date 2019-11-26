import org.junit.Test;

import static org.junit.Assert.*;

public class TeenSumTest {

    @Test
    public void teenSum() {
        TeenSum teenSum = new TeenSum();
        int actual = teenSum.teenSum(13,19);
        int expected = 19;
        assertEquals(actual, expected);
            }

    @Test
    public void teenSum1() {
        TeenSum teenSum1 = new TeenSum();
        int actual = teenSum1.teenSum(12, 19);
        int expected = 19;
        assertEquals(actual, expected);

    }

    @Test
    public void teenSum2() {
        TeenSum teenSum2 = new TeenSum();
        int actual = teenSum2.teenSum(13, 20);
        int expected = 19;
        assertEquals(actual, expected);
    }


    @Test
    public void teenSum3() {
        TeenSum teenSum3 = new TeenSum();
        int actual = teenSum3.teenSum(11, 21);
        int expected = 11 + 21;
        assertEquals(actual, expected);

    }

    @Test
    public void teenSum4() {
        TeenSum teenSum4 = new TeenSum();
        int actual = teenSum4.teenSum(15, 16);
        int expected = 19;
        assertEquals(actual, expected);

    }


}