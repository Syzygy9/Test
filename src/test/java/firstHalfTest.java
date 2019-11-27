import org.junit.Test;

import static org.junit.Assert.*;

public class firstHalfTest {

    @Test
    public void firstHalf() {
        FirstHalf firstHalf = new FirstHalf();
        String actual = firstHalf.firstHalf("Vorona");
        String expected = "Vor";
        assertEquals(actual, expected);
    }

    @Test
    public void firstHalf1() {
        FirstHalf firstHalf1 = new FirstHalf();
        String actual = firstHalf1.firstHalf("V");
        String expected = "";
        assertEquals(actual, expected);
    }


    @Test
    public void firstHalf2() {
        FirstHalf firstHalf2 = new FirstHalf();
        String actual = firstHalf2.firstHalf("Crocodile");
        String expected = "Croc";
        assertEquals(actual, expected);
    }



}