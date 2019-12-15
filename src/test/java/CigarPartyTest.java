import static org.junit.Assert.*;

public class CigarPartyTest {

    //GIVEN
    private CigarParty cigarParty = new CigarParty();

    @org.junit.Test
    public void ShouldReturnTrueByBoundaryConditionOnWeekend() {
        //WHEN
        boolean actual = cigarParty.cigarParty(40, true);
        //THEN
        assertTrue(actual);

    }

    @org.junit.Test
    public void ShouldReturnTrueByBoundaryConditionOnWeekday() {
        //WHEN
        boolean actual = cigarParty.cigarParty(40, false);
        //THEN
        assertTrue(actual);

    }

    @org.junit.Test
    public void ShouldReturnTrueByValidValueOnWeekday() {
        //WHEN
        boolean actual = cigarParty.cigarParty(60, false);
        //THEN
        assertTrue(actual);

    }


    @org.junit.Test
    public void ShouldReturnTrueByValidValueOnWeekend() {
        //WHEN
        boolean actual = cigarParty.cigarParty(65, true);
        //THEN
        assertTrue(actual);

    }

    @org.junit.Test
    public void ShouldReturnFalseByInvalidValueOnWeekday() {
        //WHEN
        boolean actual = cigarParty.cigarParty(65, false);
        //THEN
        assertFalse(actual);

    }

    @org.junit.Test
    public void ShouldReturnFalseByNullValueOnWeekend() {
        //WHEN
        boolean actual = cigarParty.cigarParty(0, true);
        //THEN
        assertFalse(actual);
    }

    @org.junit.Test
    public void ShouldReturnFalseByNullValueOnWeekday() {
        //WHEN
        boolean actual = cigarParty.cigarParty(0, false);
        //THEN
        assertFalse(actual);
    }

    @org.junit.Test
    public void ShouldReturnTrueByBigValidValueOnWeekend() {
        //WHEN
        boolean actual = cigarParty.cigarParty(1000000000, true);
        //THEN
        assertTrue(actual);
    }










}