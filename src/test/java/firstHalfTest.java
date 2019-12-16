import org.junit.Test;

import static org.junit.Assert.*;

public class firstHalfTest {
    //GIVEN
    private FirstHalf firstHalf = new FirstHalf();

    @Test
    public void shouldReturnFirstHalfOfVorona() {
        //WHEN
        String actual = firstHalf.firstHalf("Vorona");
        String expected = "Vor";
        //THEN
        assertEquals(actual, expected);

    }

    @Test
    public void shouldReturnFirstHalfOfSingleLetter() {
        //WHEN
        String actual = firstHalf.firstHalf("V");
        String expected = "";
        //THEN
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnFirstHalfOfOddNumberedWord() {
        //WHEN
        String actual = firstHalf.firstHalf("Crocodile");
        String expected = "Croc";
        //THEN
        assertEquals(actual, expected);
    }

    @Test (expected = NullPointerException.class)
    public void shouldThrowExceptionWhenStringIsNull() {
        //WHEN
        String actual = firstHalf.firstHalf (null);
        String expected = "Argument can't be null";
        //THEN
        assertEquals(actual, expected);

    }




}