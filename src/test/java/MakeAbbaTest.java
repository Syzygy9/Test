import org.junit.Test;

import static org.junit.Assert.*;

public class MakeAbbaTest {

    @Test
    public void makeAbba() {
        MakeAbba makeAbba = new MakeAbba();
        String a = makeAbba.makeAbba("kazi", "nak" );
        String expected = "kazinaknaknakkazi";
    }


}