import org.junit.Test;

import static org.junit.Assert.*;

public class MakeOutWordTest {

    //GIVEN
    MakeOutWord makeOutWord = new MakeOutWord();

    @Test
    public void ShouldReturnWordInQuotationMarks() {
        //WHEN
        String actual = makeOutWord.makeOutWord ("<<>>", "word");
        String expected = "<<word>>";
        //THEN
        assertEquals(actual, expected);

    }

    @Test (expected = IllegalArgumentException.class)
    public void ShouldThrowExceptionWhenArgumentIsNull() {
        //WHEN
        String actual = makeOutWord.makeOutWord("<<>>", null);
        String expected = "The argument can't be null";
        //THEN
        assertEquals(actual, expected);

    }


}