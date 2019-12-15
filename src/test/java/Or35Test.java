import org.junit.Test;

import static org.junit.Assert.*;

public class Or35Test {

    //GIVEN
    Or35 or35 = new Or35();

    @Test
    public void ShouldReturnTrueWhenNumberIsDividedByThreeAndFiveWithoutReminder() {
        //WHEN
        boolean actual = or35.or35(15);
        //THEN
        assertTrue(actual);
    }

    @Test
    public void ShouldReturnTrueWhenNumberIsDividedByThreeWithoutReminder() {
        //WHEN
        boolean actual = or35.or35(3);
        //THEN
        assertTrue(actual);
    }

    @Test
    public void ShouldReturnTrueWhenNumberIsDividedByFiveWithoutReminder() {
        //WHEN
        boolean actual = or35.or35(5);
        //THEN
        assertTrue(actual);
    }

    @Test
    public void ShouldReturnTrueWhenZeroIsDividedByThreeAndFiveWithoutReminder() {
        //WHEN
        boolean actual = or35.or35(0);
        //THEN
        assertTrue(actual);
    }

    @Test
    public void ShouldReturnFalseWhenNumberIsDividedByThreeAndFiveWithReminder() {
        //WHEN
        boolean actual = or35.or35(41);
        //THEN
        assertFalse(actual);
    }


}