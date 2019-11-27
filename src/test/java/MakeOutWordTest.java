import org.junit.Test;

import static org.junit.Assert.*;

public class MakeOutWordTest {

    @Test
    public void makeOutWord() {
        MakeOutWord makeOutWord = new MakeOutWord();
        String actual = makeOutWord.makeOutWord ("<<>>", "word");
        String expected = "<<word>>";
        assertEquals(actual, expected);

    }

    @Test
    public void makeOutWord1() {
        MakeOutWord makeOutWord1 = new MakeOutWord();
        String actual = makeOutWord1.makeOutWord ("[]", "Woohoo");
        String expected = "[Woohoo]";
        assertEquals(actual, expected);

    }

}