import static org.junit.Assert.*;

public class CigarPartyTest {

    //GIVEN
    private CigarParty cigarParty = new CigarParty();

    @org.junit.Test
    public void shouldReturnTrueByBoundaryConditionOnWeekend() {
        //WHEN
        boolean actual = cigarParty.cigarParty(40, true);
        //THEN
        assertTrue(actual);

    }

    @org.junit.Test
    public void shouldReturnTrueByBoundaryConditionOnWeekday() {
        //WHEN
        boolean actual = cigarParty.cigarParty(40, false);
        //THEN
        assertTrue(actual);

    }

    @org.junit.Test
    public void shouldReturnTrueByValidValueOnWeekday() {
        //WHEN
        boolean actual = cigarParty.cigarParty(60, false);
        //THEN
        assertTrue(actual);

    }


    @org.junit.Test
    public void shouldReturnTrueByValidValueOnWeekend() {
        //WHEN
        boolean actual = cigarParty.cigarParty(65, true);
        //THEN
        assertTrue(actual);

    }

    @org.junit.Test
    public void shouldReturnFalseByInvalidValueOnWeekday() {
        //WHEN
        boolean actual = cigarParty.cigarParty(65, false);
        //THEN
        assertFalse(actual);

    }

    @org.junit.Test
    public void shouldReturnFalseByNullValueOnWeekend() {
        //WHEN
        boolean actual = cigarParty.cigarParty(0, true);
        //THEN
        assertFalse(actual);
    }

    @org.junit.Test
    public void shouldReturnFalseByNullValueOnWeekday() {
        //WHEN
        boolean actual = cigarParty.cigarParty(0, false);
        //THEN
        assertFalse(actual);
    }

    @org.junit.Test
    public void shouldReturnTrueByBigValidValueOnWeekend() {
        //WHEN
        boolean actual = cigarParty.cigarParty(1000000000, true);
        //THEN
        assertTrue(actual);
    }










}