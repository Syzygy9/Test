import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SeeColorTest {

    //GIVEN
    private SeeColor seeColor = new SeeColor();

    @Test
    public void shouldReturnFirstWordBlue() {
        //WHEN
        String a = seeColor.seeColor("blue is the sky");
        String expected = "blue";
        //THEN
        assertEquals(a, expected);

    }
    @Test
    public void shouldReturnFirstWordRed() {
        //WHEN
       String actual = seeColor.seeColor("red rabbit is a a barbershop");
        String expected = "red";
        //THEN
        assertEquals(actual, expected);
    }
    @Test
    public void shouldReturnEmptyString() {
        //WHEN
        String actual = seeColor.seeColor("Only one side of the Moon is visible from the Earth");
        String expected = "";
        //THEN
        assertEquals(actual, expected);
    }
    @Test
    public void shouldReturnEmptyStringBecauseOfUpperCaseRed() {
        //WHEN
        String actual = seeColor.seeColor("Red Digital Cinema");
        String expected = "";
        //THEN
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnEmptyStringBecauseOfUpperCaseBlue() {
        //WHEN
        String actual = seeColor.seeColor("Blue endless see");
        String expected = "";
        //THEN
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnEmptyStringWhenGivenEmptyString() {
        //WHEN
        String actual= seeColor.seeColor("");
        String expected = "";
        //THEN
        assertEquals(actual, expected);
    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenStringIsNull() {
        //WHEN
        String actual= seeColor.seeColor(null);
        String expected = "String can't be null";
        //THEN
        assertEquals(actual, expected);
    }





}










