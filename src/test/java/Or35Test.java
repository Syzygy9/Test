import org.junit.Test;

import static org.junit.Assert.*;

public class Or35Test {

    @Test
    public void or35() {
        Or35 or35 = new Or35();
        boolean q = or35.or35(15);
        boolean expected = true;
        assertEquals(q, expected);
    }

    @Test
    public void or351() {
        Or35 or351 = new Or35();
        boolean q = or351.or35(3);
        boolean expected = true;
        assertEquals(q, expected);
    }

    @Test
    public void or352() {
        Or35 or352 = new Or35();
        boolean q = or352.or35(5);
        boolean expected = true;
        assertEquals(q, expected);
    }

    @Test
    public void or353() {
        Or35 or353 = new Or35();
        boolean q = or353.or35(0);
        boolean expected = true;
        assertEquals(q, expected);
    }

    @Test
    public void or354() {
        Or35 or354 = new Or35();
        boolean q = or354.or35(41);
        boolean expected = false;
        assertEquals(q, expected);
    }


}