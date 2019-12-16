import org.junit.Test;

import static org.junit.Assert.*;

public class Or35Test {

    //GIVEN
    private Or35 or35 = new Or35();

    @Test
    public void shouldReturnTrueWhenNumberIsDividedByThreeAndFiveWithoutReminder() {
        //WHEN
        boolean actual = or35.or35(15);
        //THEN
        assertTrue(actual);
    }

    @Test
    public void shouldReturnTrueWhenNumberIsDividedByThreeWithoutReminder() {
        //WHEN
        boolean actual = or35.or35(3);
        //THEN
        assertTrue(actual);
    }

    @Test
    public void shouldReturnTrueWhenNumberIsDividedByFiveWithoutReminder() {
        //WHEN
        boolean actual = or35.or35(5);
        //THEN
        assertTrue(actual);
    }

    @Test
    public void shouldReturnTrueWhenZeroIsDividedByThreeAndFiveWithoutReminder() {
        //WHEN
        boolean actual = or35.or35(0);
        //THEN
        assertTrue(actual);
    }

    @Test
    public void shouldReturnFalseWhenNumberIsDividedByThreeAndFiveWithReminder() {
        //WHEN
        boolean actual = or35.or35(41);
        //THEN
        assertFalse(actual);
    }


}