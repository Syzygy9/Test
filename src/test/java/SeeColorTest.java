import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SeeColorTest {

    @Test
    public void seeColor() {
        SeeColor seeColor = new SeeColor();
        String a = seeColor.seeColor("blue is the sky");
        String expected = "blue";
        assertEquals(a, expected);

    }
    @Test
    public void seeColor1() {
        SeeColor seeColor1 = new SeeColor();
        String a = seeColor1.seeColor("red rabbit is a a barbershop");
        String expected = "red";
        assertEquals(a, expected);
    }
    @Test
    public void seeColor2() {
        SeeColor seeColor2 = new SeeColor();
        String a = seeColor2.seeColor("Only one side of the Moon is visible from the Earth");
        String expected = "";
        assertEquals(a, expected);
    }
    @Test
    public void seeColor3() {
        SeeColor seeColor3 = new SeeColor();
        String a = seeColor3.seeColor("Red Digital Cinema");
        String expected = "";
        assertEquals(a, expected);
    }

    @Test
    public void seeColor4() {
        SeeColor seeColor4 = new SeeColor();
        String a = seeColor4.seeColor("Blue endless see");
        String expected = "";
        assertEquals(a, expected);
    }

    @Test
    public void seeColor5() {
        SeeColor seeColor5 = new SeeColor();
        String a = seeColor5.seeColor("");
        String expected = "";
        assertEquals(a, expected);
    }



}










