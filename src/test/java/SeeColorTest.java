import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SeeColorTest {

    //GIVEN
    SeeColor seeColor = new SeeColor();

    @Test
    public void ShouldReturnFirstWordBlue() {
        //WHEN
        String a = seeColor.seeColor("blue is the sky");
        String expected = "blue";
        //THEN
        assertEquals(a, expected);

    }
    @Test
    public void ShouldReturnFirstWordRed() {
        //WHEN
       String actual = seeColor.seeColor("red rabbit is a a barbershop");
        String expected = "red";
        //THEN
        assertEquals(actual, expected);
    }
    @Test
    public void ShouldReturnEmptyString() {
        //WHEN
        String actual = seeColor.seeColor("Only one side of the Moon is visible from the Earth");
        String expected = "";
        //THEN
        assertEquals(actual, expected);
    }
    @Test
    public void ShouldReturnEmptyStringBecauseOfUpperCaseRed() {
        //WHEN
        String actual = seeColor.seeColor("Red Digital Cinema");
        String expected = "";
        //THEN
        assertEquals(actual, expected);
    }

    @Test
    public void ShouldReturnEmptyStringBecauseOfUpperCaseBlue() {
        //WHEN
        String actual = seeColor.seeColor("Blue endless see");
        String expected = "";
        //THEN
        assertEquals(actual, expected);
    }

    @Test
    public void ShouldReturnEmptyStringWhenGivenEmptyString() {
        //WHEN
        String actual= seeColor.seeColor("");
        String expected = "";
        //THEN
        assertEquals(actual, expected);
    }

    @Test (expected = IllegalArgumentException.class)
    public void ShouldThrowExceptionWhenStringIsNull() {
        //WHEN
        String actual= seeColor.seeColor(null);
        String expected = "String can't be null";
        //THEN
        assertEquals(actual, expected);
    }





}










