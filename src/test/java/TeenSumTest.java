import org.junit.Test;

import static org.junit.Assert.*;

public class TeenSumTest {

    //GIVEN
    private TeenSum teenSum = new TeenSum();

    @Test
    public void shouldReturnNineteenWhenCheckingBothBoundaryConditions() {
        //WHEN
        int actual = teenSum.teenSum(13,19);
        int expected = 19;
        //THEN
        assertEquals(actual, expected);
            }

    @Test
    public void shouldReturnNineteenWhenChekingSecondBoundaryCondition() {
        //WHEN
        int actual = teenSum.teenSum(12, 19);
        int expected = 19;
        //THEN
        assertEquals(actual, expected);

    }

    @Test
    public void shouldReturnNineteenWhenCheckingFirstBoundaryCondition() {
        //WHEN
        int actual = teenSum.teenSum(13, 20);
        int expected = 19;
        //THEN
        assertEquals(actual, expected);
    }


    @Test
    public void shouldReturnSumWhenCheckingNumbersOutOfDiapasonBound() {
        //WHEN
        int actual = teenSum.teenSum(11, 21);
        int expected = 11 + 21;
        //THEN
        assertEquals(actual, expected);

    }

    @Test
    public void shouldReturnNineteenWhenCheckingNumbersInDiapasonBounds() {
        //WHEN
        int actual = teenSum.teenSum(15, 16);
        int expected = 19;
        //THEN
        assertEquals(actual, expected);

    }


}