import org.junit.Test;

import static org.junit.Assert.*;

public class MakeEndsTest {

    //GIVEN
    private MakeEnds makeEnds = new MakeEnds();

    @Test
    public void shouldReturnFirstAndLastElement() {
        //WHEN
        int[] actual = makeEnds.makeEnds(new int[]{1, 2, 3, 4, 5, 6});
        int[] expected = new int[]{1, 6};
        //THEN
        assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldReturnFirstZeroElementAndLastElement() {
        //WHEN
        int[] actual = makeEnds.makeEnds(new int[]{0, 1, 2, 3, 4, 5});
        int[] expected = new int[]{0, 5};
        //THEN
        assertArrayEquals(actual, expected);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenArgumentIsNull() {
        //WHEN
        int[] actual = makeEnds.makeEnds(null);

    }


    }


