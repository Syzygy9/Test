import static org.junit.Assert.*;

public class CigarPartyTest {

    @org.junit.Test
    public void cigarParty() {
        CigarParty cigarParty = new CigarParty();
        boolean actual = cigarParty.cigarParty(40, true);
        boolean expected = true;
        assertEquals(actual, expected);

    }

    @org.junit.Test
    public void cigarParty1() {
        CigarParty cigarParty1 = new CigarParty();
        boolean actual = cigarParty1.cigarParty(40, false);
        boolean expected = true;
        assertEquals(actual, expected);

    }

    @org.junit.Test
    public void cigarParty2() {
        CigarParty cigarParty2 = new CigarParty();
        boolean actual = cigarParty2.cigarParty(60, false);
        boolean expected = true;
        assertEquals(actual, expected);

    }


    @org.junit.Test
    public void cigarParty3() {
        CigarParty cigarParty3 = new CigarParty();
        boolean actual = cigarParty3.cigarParty(65, true);
        boolean expected = true;
        assertEquals(actual, expected);

    }

    @org.junit.Test
    public void cigarParty4() {
        CigarParty cigarParty4 = new CigarParty();
        boolean actual = cigarParty4.cigarParty(65, false);
        boolean expected = false;
        assertEquals(actual, expected);

    }

    @org.junit.Test
    public void cigarParty5() {
        CigarParty cigarParty5 = new CigarParty();
        boolean actual = cigarParty5.cigarParty(0, true);
        boolean expected = false;
        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void cigarParty6() {
        CigarParty cigarParty6 = new CigarParty();
        boolean actual = cigarParty6.cigarParty(0, false);
        boolean expected = false;
        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void cigarParty7() {
        CigarParty cigarParty7 = new CigarParty();
        boolean actual = cigarParty7.cigarParty(1000000000, true);
        boolean expected = true;
        assertEquals(actual, expected);
    }







}