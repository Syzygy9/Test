import org.junit.Test;

import static org.junit.Assert.*;

public class MakeAbbaTest {

    //GIVEN
    private MakeAbba makeAbba = new MakeAbba();

    @Test
    public void shouldReturnConctinationInDirectAndReversedOrder() {
        //WHEN
        String actual = makeAbba.makeAbba("kotu skoro ", "sorok sutok " );
        String expected = "kotu skoro sorok sutok sorok sutok kotu skoro ";
        //THEN
        assertEquals(actual, expected);
    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenBothArgumentsAreNull () {
        //WHEN
        String actual = makeAbba.makeAbba(null, null);
        String expected = "The arguments can't be null";
        //THEN
        assertEquals(actual, expected);

            }











}